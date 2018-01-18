/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.Printsupport.MyPrintable;
import java.awt.Color;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.table.DefaultTableModel;
import java.awt.Toolkit;

/**Raised
 *
 * @author Kibathi's
 */
public class POS extends javax.swing.JFrame {

    /**
     * Creates new form POS
     */
    static Connection connection;
    public POS() {
       
        initComponents();
        Functionalities.fetch(this, Functionalities.pos_menu, display_table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        overlay = new javax.swing.JPanel();
        menu_pnl = new javax.swing.JPanel();
        brkfst = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        snacks = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        meals = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        drinks = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        display_pnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_table = new javax.swing.JTable();
        order_pnl = new javax.swing.JPanel();
        orderNavPnl = new javax.swing.JPanel();
        addOrderItemPnl = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        removeOrderItemPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cancelOrderPnl = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        confirmOrderPnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        order_table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("POS");
        setIconImage(Toolkit.getDefaultToolkit().getImage(POS.class.getResource("/images/logo.png")));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overlay.setBackground(new java.awt.Color(244, 176, 66));

        menu_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brkfst.setBackground(new java.awt.Color(155, 100, 40));
        brkfst.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        brkfst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brkfstMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brkfstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                brkfstMouseExited(evt);
            }
        });

        jLabel6.setText("Breakfast");

        javax.swing.GroupLayout brkfstLayout = new javax.swing.GroupLayout(brkfst);
        brkfst.setLayout(brkfstLayout);
        brkfstLayout.setHorizontalGroup(
            brkfstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brkfstLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        brkfstLayout.setVerticalGroup(
            brkfstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, brkfstLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(38, 38, 38))
        );

        menu_pnl.add(brkfst, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 110));

        snacks.setBackground(new java.awt.Color(155, 100, 40));
        snacks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        snacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snacksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                snacksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                snacksMouseExited(evt);
            }
        });

        jLabel7.setText("Snacks");

        javax.swing.GroupLayout snacksLayout = new javax.swing.GroupLayout(snacks);
        snacks.setLayout(snacksLayout);
        snacksLayout.setHorizontalGroup(
            snacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacksLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        snacksLayout.setVerticalGroup(
            snacksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(snacksLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        menu_pnl.add(snacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, 120, 110));

        meals.setBackground(new java.awt.Color(155, 100, 40));
        meals.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        meals.setPreferredSize(new java.awt.Dimension(92, 100));
        meals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mealsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mealsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mealsMouseExited(evt);
            }
        });

        jLabel8.setText("Meals");

        javax.swing.GroupLayout mealsLayout = new javax.swing.GroupLayout(meals);
        meals.setLayout(mealsLayout);
        mealsLayout.setHorizontalGroup(
            mealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mealsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        mealsLayout.setVerticalGroup(
            mealsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mealsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        menu_pnl.add(meals, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 212, 120, 110));

        drinks.setBackground(new java.awt.Color(155, 100, 40));
        drinks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        drinks.setPreferredSize(new java.awt.Dimension(92, 100));
        drinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                drinksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                drinksMouseExited(evt);
            }
        });

        jLabel9.setText("Drinks");

        javax.swing.GroupLayout drinksLayout = new javax.swing.GroupLayout(drinks);
        drinks.setLayout(drinksLayout);
        drinksLayout.setHorizontalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinksLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        drinksLayout.setVerticalGroup(
            drinksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drinksLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel9)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        menu_pnl.add(drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 318, 120, -1));

        display_pnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemCode", "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        display_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(display_table);
        if (display_table.getColumnModel().getColumnCount() > 0) {
            display_table.getColumnModel().getColumn(0).setPreferredWidth(10);
            display_table.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        display_pnl.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 540));

        order_pnl.setBackground(new java.awt.Color(244, 176, 66));

        orderNavPnl.setBackground(new java.awt.Color(244, 176, 66));
        orderNavPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        addOrderItemPnl.setBackground(new java.awt.Color(244, 176, 66));
        addOrderItemPnl.setPreferredSize(new java.awt.Dimension(40, 40));
        addOrderItemPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrderItemPnlMouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(184, 158, 130));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add.png"))); // NOI18N

        javax.swing.GroupLayout addOrderItemPnlLayout = new javax.swing.GroupLayout(addOrderItemPnl);
        addOrderItemPnl.setLayout(addOrderItemPnlLayout);
        addOrderItemPnlLayout.setHorizontalGroup(
            addOrderItemPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addOrderItemPnlLayout.setVerticalGroup(
            addOrderItemPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        removeOrderItemPnl.setBackground(new java.awt.Color(244, 176, 66));
        removeOrderItemPnl.setPreferredSize(new java.awt.Dimension(40, 40));
        removeOrderItemPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeOrderItemPnlMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(184, 158, 130));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-minus.png"))); // NOI18N

        javax.swing.GroupLayout removeOrderItemPnlLayout = new javax.swing.GroupLayout(removeOrderItemPnl);
        removeOrderItemPnl.setLayout(removeOrderItemPnlLayout);
        removeOrderItemPnlLayout.setHorizontalGroup(
            removeOrderItemPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, removeOrderItemPnlLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        removeOrderItemPnlLayout.setVerticalGroup(
            removeOrderItemPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeOrderItemPnlLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cancelOrderPnl.setBackground(new java.awt.Color(244, 176, 66));
        cancelOrderPnl.setPreferredSize(new java.awt.Dimension(40, 40));
        cancelOrderPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelOrderPnlMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(184, 158, 130));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel-40.png"))); // NOI18N

        javax.swing.GroupLayout cancelOrderPnlLayout = new javax.swing.GroupLayout(cancelOrderPnl);
        cancelOrderPnl.setLayout(cancelOrderPnlLayout);
        cancelOrderPnlLayout.setHorizontalGroup(
            cancelOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cancelOrderPnlLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        cancelOrderPnlLayout.setVerticalGroup(
            cancelOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        confirmOrderPnl.setBackground(new java.awt.Color(244, 176, 66));
        confirmOrderPnl.setPreferredSize(new java.awt.Dimension(40, 40));
        confirmOrderPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmOrderPnlMouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(184, 158, 130));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-checked.png"))); // NOI18N

        javax.swing.GroupLayout confirmOrderPnlLayout = new javax.swing.GroupLayout(confirmOrderPnl);
        confirmOrderPnl.setLayout(confirmOrderPnlLayout);
        confirmOrderPnlLayout.setHorizontalGroup(
            confirmOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmOrderPnlLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        confirmOrderPnlLayout.setVerticalGroup(
            confirmOrderPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmOrderPnlLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout orderNavPnlLayout = new javax.swing.GroupLayout(orderNavPnl);
        orderNavPnl.setLayout(orderNavPnlLayout);
        orderNavPnlLayout.setHorizontalGroup(
            orderNavPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderNavPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orderNavPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orderNavPnlLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(removeOrderItemPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(addOrderItemPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(orderNavPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelOrderPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(confirmOrderPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        orderNavPnlLayout.setVerticalGroup(
            orderNavPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderNavPnlLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(orderNavPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelOrderPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrderItemPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orderNavPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeOrderItemPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmOrderPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("TOTAL:");

        total_field.setEditable(false);
        total_field.setBackground(new java.awt.Color(244, 176, 66));
        total_field.setText("0");
        total_field.setFocusable(false);

        jLabel2.setText("ORDER LIST");

        order_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(order_table);
        if (order_table.getColumnModel().getColumnCount() > 0) {
            order_table.getColumnModel().getColumn(0).setPreferredWidth(0);
            order_table.getColumnModel().getColumn(1).setPreferredWidth(0);
        }

        javax.swing.GroupLayout order_pnlLayout = new javax.swing.GroupLayout(order_pnl);
        order_pnl.setLayout(order_pnlLayout);
        order_pnlLayout.setHorizontalGroup(
            order_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_pnlLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(131, 131, 131))
            .addComponent(orderNavPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(order_pnlLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(order_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        order_pnlLayout.setVerticalGroup(
            order_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, order_pnlLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(order_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(orderNavPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(244, 176, 66));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-back-arrow-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        javax.swing.GroupLayout overlayLayout = new javax.swing.GroupLayout(overlay);
        overlay.setLayout(overlayLayout);
        overlayLayout.setHorizontalGroup(
            overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overlayLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE)
                .addComponent(order_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(overlayLayout.createSequentialGroup()
                    .addComponent(menu_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 700, Short.MAX_VALUE)))
            .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overlayLayout.createSequentialGroup()
                    .addContainerGap(115, Short.MAX_VALUE)
                    .addComponent(display_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(335, Short.MAX_VALUE)))
        );
        overlayLayout.setVerticalGroup(
            overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overlayLayout.createSequentialGroup()
                .addComponent(order_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overlayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(overlayLayout.createSequentialGroup()
                    .addComponent(menu_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 142, Short.MAX_VALUE)))
            .addGroup(overlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(overlayLayout.createSequentialGroup()
                    .addComponent(display_pnl, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 21, Short.MAX_VALUE)))
        );

        getContentPane().add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 560));

        setSize(new java.awt.Dimension(817, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void brkfstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brkfstMouseEntered
        // TODO add your handling code here:
        setColor(brkfst);
    }//GEN-LAST:event_brkfstMouseEntered

    private void brkfstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brkfstMouseExited
        // TODO add your handling code here:
        resetColor(brkfst);
    }//GEN-LAST:event_brkfstMouseExited

    private void snacksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snacksMouseEntered
        // TODO add your handling code here:
        setColor(snacks);
    }//GEN-LAST:event_snacksMouseEntered

    private void snacksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snacksMouseExited
        // TODO add your handling code here:
        resetColor(snacks);
    }//GEN-LAST:event_snacksMouseExited

    private void mealsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealsMouseEntered
        // TODO add your handling code here:
        setColor(meals);
    }//GEN-LAST:event_mealsMouseEntered

    private void mealsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealsMouseExited
        // TODO add your handling code here:
        resetColor(meals);
    }//GEN-LAST:event_mealsMouseExited

    private void drinksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksMouseEntered
        // TODO add your handling code here:
        setColor(drinks);
    }//GEN-LAST:event_drinksMouseEntered

    private void drinksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksMouseExited
        // TODO add your handling code here:
        resetColor(drinks);
    }//GEN-LAST:event_drinksMouseExited

    private void confirmOrderPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmOrderPnlMouseClicked
        // TODO add your handling code here:
       int choice = JOptionPane.showConfirmDialog(this, "Confirm order", "CONFIRM ORDER", JOptionPane.OK_CANCEL_OPTION);
        if (choice == JOptionPane.OK_OPTION){
            try {
            Class.forName(Functionalities.DRIVER);
            connection = DriverManager.getConnection(Functionalities.URL, Functionalities.USER, Functionalities.PASSWORD);
            
//            -----------------------Checking if TODAY has an entry-------------------------------------
            PreparedStatement stm = connection.prepareStatement("SELECT * FROM `sales` WHERE Date = DATE(now());");
            ResultSet rs = stm.executeQuery();
            
            if (rs.next() == false && Integer.parseInt(total_field.getText()) != 0){   
                 
            PreparedStatement st = connection.prepareStatement(Functionalities.dsales_insert);
            st.setString(1, "1");
            st.setString(2, total_field.getText());
            st.execute();
            
            } else if(Integer.parseInt(total_field.getText()) != 0){
                
                int sales = rs.getInt("Sales");
                int amount = rs.getInt("Amount");
                
                String newAmount = Integer.toString(Integer.parseInt(total_field.getText()) + amount);
                String newSales = Integer.toString(sales + 1);
                PreparedStatement statement = connection.prepareStatement(Functionalities.dsales_update);
                statement.setString(1, newSales);
                statement.setString(2, newAmount);
                statement.execute();
                
            }          
           
            connection.close();
            } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
            }
        } else if (choice == JOptionPane.CANCEL_OPTION){
            
        }
        DefaultTableModel model = (DefaultTableModel) order_table.getModel();
        model.setRowCount(0);
        total_field.setText("0");
        
        display_table.clearSelection();
        display_table.setFocusable(false);
        /*                 ################ PRINTING OF THE RECEIPT###################                                                                */
         Printsupport ps=new Printsupport();
         Object printitem [][]=ps.getTableData(order_table);
         Printsupport.setItems(printitem);
       
         PrinterJob pj = PrinterJob.getPrinterJob();
         pj.setPrintable(new MyPrintable(),Printsupport.getPageFormat(pj));
                   try {
                        pj.print();
           
                        }
                    catch (PrinterException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(this, ex);
                    }
        
    }//GEN-LAST:event_confirmOrderPnlMouseClicked

    private void addOrderItemPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrderItemPnlMouseClicked
        // TODO add your handling code here:
        
        int total = Integer.parseInt(total_field.getText());
        DefaultTableModel model1 = (DefaultTableModel) display_table.getModel();
        int [] index = display_table.getSelectedRows();
        
        Object[] row = new Object[2];
         DefaultTableModel model = (DefaultTableModel) order_table.getModel();
        for (int count = 0; count < index.length; count++) {
            row[0] = model1.getValueAt(index[count],1 );
            row[1] = model1.getValueAt(index[count],2);
            total = total + (int)model1.getValueAt(index[count],2);
            model.addRow(row);
        }
        total_field.setText(Integer.toString(total));
       
       
    }//GEN-LAST:event_addOrderItemPnlMouseClicked

    private void brkfstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brkfstMouseClicked
        // TODO add your handling code here:
        selectionShow(brkfst, meals, snacks, drinks);
        Functionalities.fetch(this, Functionalities.breakfast_query, display_table);
    }//GEN-LAST:event_brkfstMouseClicked

    private void snacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snacksMouseClicked
        // TODO add your handling code here:
        selectionShow(snacks, meals, brkfst, drinks);
          Functionalities.fetch(this, Functionalities.snacks_query, display_table);      
    }//GEN-LAST:event_snacksMouseClicked

    private void mealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealsMouseClicked
        // TODO add your handling code here:
        selectionShow(meals, drinks, snacks, brkfst);
        Functionalities.fetch(this, Functionalities.meals_query, display_table);
    }//GEN-LAST:event_mealsMouseClicked

    private void drinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksMouseClicked
        // TODO add your handling code here:
        selectionShow(drinks, meals, snacks, brkfst);
        Functionalities.fetch(this, Functionalities.drinks_query, display_table);
    }//GEN-LAST:event_drinksMouseClicked

    private void removeOrderItemPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeOrderItemPnlMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) order_table.getModel();
        int total = Integer.parseInt(total_field.getText());
        try {
            int SelectedRowIndex = order_table.getSelectedRow();            
            total = total - (int)model.getValueAt(SelectedRowIndex, 1);
            
            model.removeRow(SelectedRowIndex);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        total_field.setText(Integer.toString(total));
    }//GEN-LAST:event_removeOrderItemPnlMouseClicked

    private void cancelOrderPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelOrderPnlMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) order_table.getModel();
        model.setRowCount(0);
        total_field.setText("0");
        
        display_table.clearSelection();
        display_table.setFocusable(false);
    }//GEN-LAST:event_cancelOrderPnlMouseClicked

    
    // ---------------------   Changing background color of buttons for responsive feel ---------------
    
    public void setColor(JPanel panel){
        try {
          panel.setBackground(new Color(92, 63, 32));  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bug found. Contact developer", "Bug Found", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    public void resetColor(JPanel panel){
        try {
            panel.setBackground(new Color(155,100,40));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Bug found. Contact developer", "Bug Found", JOptionPane.ERROR_MESSAGE);
        }
                
        
    }
    
//   -----------------------------  END  ------------------------------------------------------- 
    
    private void selectionShow(JPanel one, JPanel two, JPanel three, JPanel four){
        setColor(one);
        resetColor(two);
        resetColor(three);
        resetColor(four);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    }
                    catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(POS.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new POS().setVisible(true);
             }
        });
    }
    

    // Variables declaration - do not modify                         

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addOrderItemPnl;
    private javax.swing.JPanel brkfst;
    private javax.swing.JPanel cancelOrderPnl;
    private javax.swing.JPanel confirmOrderPnl;
    private javax.swing.JPanel display_pnl;
    private javax.swing.JTable display_table;
    private javax.swing.JPanel drinks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel meals;
    private javax.swing.JPanel menu_pnl;
    private javax.swing.JPanel orderNavPnl;
    private javax.swing.JPanel order_pnl;
    private javax.swing.JTable order_table;
    private javax.swing.JPanel overlay;
    private javax.swing.JPanel removeOrderItemPnl;
    private javax.swing.JPanel snacks;
    private javax.swing.JTextField total_field;
    // End of variables declaration//GEN-END:variables
}
