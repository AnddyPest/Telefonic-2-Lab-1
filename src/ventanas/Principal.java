package ventanas;

import clases.principal.Cliente;
import entidades.clases.EntidadesTelefono;
import entidades.clases.EntidadesCliente;
import entidades.clases.EntidadesMapa;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    EntidadesCliente entidadesCliente = new EntidadesCliente();
    EntidadesTelefono entidadesTelefono = new EntidadesTelefono();
    EntidadesMapa entidadesMapa = new EntidadesMapa();
    private final DefaultTableModel modelo = new DefaultTableModel();
    
    //Algunos datos para probar (Las webadas nuevas que se vayan a crear, sean variables u objetos se instancian aca, en el Public Class Principal que extiende el frame.
    Cliente client1 = new Cliente(31000001, "Juan", "Pérez", "San Luis", "Calle Falsa 123");
    Cliente client2 = new Cliente(31000002, "María", "Gómez", "San Luis", "Av. Siempreviva 456");
    Cliente client3 = new Cliente(31000003, "Carlos", "Rodríguez", "San Luis", "Calle de los Olmos 789");
    Cliente client4 = new Cliente(31000004, "Ana", "Fernández", "San Luis", "Pje. del Sol 321");
    Cliente client5 = new Cliente(31000005, "Luis", "Martínez", "San Luis", "Camino Real 654");
    Cliente client6 = new Cliente(31000006, "Elena", "Lopez", "Villa Mercedes", "Barrio Nuevo 987");
    Cliente client7 = new Cliente(31000007, "Pablo", "García", "Villa Mercedes", "Av. Mitre 111");
    Cliente client8 = new Cliente(31000008, "Lucía", "Sánchez", "Villa Mercedes", "Calle del Lago 222");
    Cliente client9 = new Cliente(31000009, "Miguel", "Ruiz", "La Punta", "Calle Central 333");
    Cliente client10 = new Cliente(31000010, "Sofía", "Hernández", "La Punta", "Calle Principal 444");
    
    Long celu1 = 1234567890L;
    Long celu2 = 2345678901L;
    Long celu3 = 3456789012L;
    Long celu4 = 4567890123L;
    Long celu5 = 5678901234L;
    Long celu6 = 6789012345L;
    Long celu7 = 7890123456L;
    Long celu8 = 8901234567L;
    Long celu9 = 9012345678L;
    Long celu10 = 1023456789L;
    Long celu11 = 2123456780L;
    Long celu12 = 3123456781L;
    Long celu13 = 4123456782L;
    Long celu14 = 5123456783L;
    Long celu15 = 6123456784L;
    
    public Principal() {
        initComponents();
        setExtendedState(Principal.MAXIMIZED_BOTH);
        cabeceraTabla();
        //Aca podemos usar los metodos, no en el anterior... me volvi chango
        //Agregamos los clientes y telefonos creados a su respectivo set, CUIDADO AL AGREGAR ASI PORQUE NO ANDAN LOS FILTROS CHICOS, Fijense que los long sean
        //long(poniendo 'L' al final del numero y que los ints sean ints.
        //CLIENTES
        entidadesCliente.agregarCliente(client1);
        entidadesCliente.agregarCliente(client2);
        entidadesCliente.agregarCliente(client3);
        entidadesCliente.agregarCliente(client4);
        entidadesCliente.agregarCliente(client5);
        entidadesCliente.agregarCliente(client6);
        entidadesCliente.agregarCliente(client7);
        entidadesCliente.agregarCliente(client8);
        entidadesCliente.agregarCliente(client9);
        entidadesCliente.agregarCliente(client10);
        //TELEFONOS
        entidadesTelefono.agregarTelefono(celu1);
        entidadesTelefono.agregarTelefono(celu2);
        entidadesTelefono.agregarTelefono(celu3);
        entidadesTelefono.agregarTelefono(celu4);
        entidadesTelefono.agregarTelefono(celu5);
        entidadesTelefono.agregarTelefono(celu6);
        entidadesTelefono.agregarTelefono(celu7);
        entidadesTelefono.agregarTelefono(celu8);
        entidadesTelefono.agregarTelefono(celu9);
        entidadesTelefono.agregarTelefono(celu10);
        entidadesTelefono.agregarTelefono(celu11);
        entidadesTelefono.agregarTelefono(celu12);
        entidadesTelefono.agregarTelefono(celu13);
        entidadesTelefono.agregarTelefono(celu14);
        entidadesTelefono.agregarTelefono(celu15);
        //Y ahora asociamos los telefonos con los clientes en el bedito MAPA 
        //Un flaco con 3 celus
        entidadesMapa.relacionarClienteTelefono(celu1, client1);
        entidadesMapa.relacionarClienteTelefono(celu2, client1);
        entidadesMapa.relacionarClienteTelefono(celu3, client1);
        //Otro flaco con 2 celus
        entidadesMapa.relacionarClienteTelefono(celu4, client2);
        entidadesMapa.relacionarClienteTelefono(celu5, client2);
        //El resto de la gente con 1 solo celu
        entidadesMapa.relacionarClienteTelefono(celu6, client3);
        entidadesMapa.relacionarClienteTelefono(celu7, client4);
        entidadesMapa.relacionarClienteTelefono(celu8, client5);
        entidadesMapa.relacionarClienteTelefono(celu9, client6);
        entidadesMapa.relacionarClienteTelefono(celu10, client7);
        entidadesMapa.relacionarClienteTelefono(celu11, client8);
        entidadesMapa.relacionarClienteTelefono(celu12, client9);
        entidadesMapa.relacionarClienteTelefono(celu13, client10);
        entidadesMapa.relacionarClienteTelefono(celu14, client9);
        entidadesMapa.relacionarClienteTelefono(celu15, client6);
    }

    public void habilitarBtnSave() {
        if (!txtDni.getText().isEmpty() && !txtNom.getText().isEmpty() && !txtApe.getText().isEmpty()
                && !txtDir.getText().isEmpty() && !txtCiu.getText().isEmpty() && !txtTel.getText().isEmpty()) {
            btnSave.setEnabled(true);
        } else {
            btnSave.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpBusqueda = new javax.swing.ButtonGroup();
        desktop = new javax.swing.JDesktopPane();
        panGeneral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtDir = new javax.swing.JTextField();
        txtCiu = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnErase = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        panSrc = new javax.swing.JPanel();
        btnSrc = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        radApe = new javax.swing.JRadioButton();
        radCiu = new javax.swing.JRadioButton();
        radTel = new javax.swing.JRadioButton();
        btnAcceptSrc = new javax.swing.JButton();
        btnEndSrc = new javax.swing.JButton();
        scrollBusq = new javax.swing.JScrollPane();
        tabBusq = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Guía Telefónica");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout panGeneralLayout = new javax.swing.GroupLayout(panGeneral);
        panGeneral.setLayout(panGeneralLayout);
        panGeneralLayout.setHorizontalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panGeneralLayout.setVerticalGroup(
            panGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DNI:");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre:");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dirección:");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apellido:");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Telefono:");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ciudad");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        txtDni.setEditable(false);
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtNom.setEditable(false);
        txtNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomKeyReleased(evt);
            }
        });

        txtApe.setEditable(false);
        txtApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApeKeyReleased(evt);
            }
        });

        txtDir.setEditable(false);
        txtDir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDirKeyReleased(evt);
            }
        });

        txtCiu.setEditable(false);
        txtCiu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCiuKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCiuKeyReleased(evt);
            }
        });

        txtTel.setEditable(false);
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNew.setText("Nuevo Contacto");
        btnNew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnErase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnErase.setText("Borrar");
        btnErase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnErase.setEnabled(false);
        btnErase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraseActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        panSrc.setBackground(java.awt.SystemColor.activeCaption);
        panSrc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnSrc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSrc.setText("Nueva Busqueda");
        btnSrc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSrcActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Panel de Búsqueda");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btnGrpBusqueda.add(radApe);
        radApe.setText("Por Apellido");
        radApe.setEnabled(false);
        radApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radApeActionPerformed(evt);
            }
        });

        btnGrpBusqueda.add(radCiu);
        radCiu.setText("Por Ciudad");
        radCiu.setEnabled(false);
        radCiu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radCiuActionPerformed(evt);
            }
        });

        btnGrpBusqueda.add(radTel);
        radTel.setText("Por Teléfono");
        radTel.setEnabled(false);
        radTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radTelActionPerformed(evt);
            }
        });

        btnAcceptSrc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAcceptSrc.setText("Aceptar");
        btnAcceptSrc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcceptSrc.setEnabled(false);
        btnAcceptSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptSrcActionPerformed(evt);
            }
        });

        btnEndSrc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEndSrc.setText("Finalizar");
        btnEndSrc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEndSrc.setEnabled(false);
        btnEndSrc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndSrcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSrcLayout = new javax.swing.GroupLayout(panSrc);
        panSrc.setLayout(panSrcLayout);
        panSrcLayout.setHorizontalGroup(
            panSrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSrcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panSrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radTel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panSrcLayout.createSequentialGroup()
                        .addGroup(panSrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radApe, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radCiu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAcceptSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEndSrc, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panSrcLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        panSrcLayout.setVerticalGroup(
            panSrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panSrcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panSrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSrc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAcceptSrc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panSrcLayout.createSequentialGroup()
                        .addGroup(panSrcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panSrcLayout.createSequentialGroup()
                                .addComponent(radApe)
                                .addGap(18, 18, 18)
                                .addComponent(radCiu)
                                .addGap(18, 18, 18)
                                .addComponent(radTel))
                            .addComponent(btnEndSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        scrollBusq.setEnabled(false);

        tabBusq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Telefono", "DNI", "Nombre", "Apellido", "Dirección", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabBusq.setEnabled(false);
        tabBusq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabBusqFocusGained(evt);
            }
        });
        scrollBusq.setViewportView(tabBusq);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tabla: Resultado de búsquedas");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        desktop.setLayer(panGeneral, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(txtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(txtNom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(txtApe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(txtDir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(txtCiu, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(txtTel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(btnNew, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(btnSave, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(btnErase, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(btnExit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(panSrc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(scrollBusq, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktop.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDni)
                        .addComponent(txtNom)
                        .addComponent(txtApe)
                        .addComponent(txtDir)
                        .addComponent(txtCiu, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(panSrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrollBusq))))
                .addContainerGap())
            .addGroup(desktopLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopLayout.createSequentialGroup()
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtCiu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(scrollBusq, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnErase, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panSrc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;

        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelKeyTyped

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        habilitarBtnSave();
    }//GEN-LAST:event_txtDniKeyReleased

    private void txtNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomKeyReleased
        habilitarBtnSave();
    }//GEN-LAST:event_txtNomKeyReleased

    private void txtApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyReleased
        habilitarBtnSave();
    }//GEN-LAST:event_txtApeKeyReleased

    private void txtDirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirKeyReleased
        habilitarBtnSave();
    }//GEN-LAST:event_txtDirKeyReleased

    private void txtCiuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiuKeyReleased
        habilitarBtnSave();
    }//GEN-LAST:event_txtCiuKeyReleased

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
        habilitarBtnSave();
    }//GEN-LAST:event_txtTelKeyReleased

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtDni.setEditable(true);
        txtNom.setEditable(true);
        txtApe.setEditable(true);
        txtDir.setEditable(true);
        txtCiu.setEditable(true);
        txtTel.setEditable(true);
        txtDni.setText("");
        txtNom.setText("");
        txtApe.setText("");
        txtDir.setText("");
        txtCiu.setText("");
        txtTel.setText("");
        txtDni.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int doc = Integer.parseInt(txtDni.getText());
        String nombre = txtNom.getText();
        String apellido = txtApe.getText();
        String ciudad = txtCiu.getText();
        String direccion = txtDir.getText();
        Long telefono = Long.valueOf(txtTel.getText());

        Cliente nuevoCliente = new Cliente(doc, nombre, apellido, ciudad, direccion);
        entidadesCliente.agregarCliente(nuevoCliente);
        entidadesTelefono.agregarTelefono(telefono);
        entidadesMapa.relacionarClienteTelefono(telefono, nuevoCliente);

        txtDni.setEditable(false);
        txtDni.setText("");
        txtNom.setEditable(false);
        txtNom.setText("");
        txtApe.setEditable(false);
        txtApe.setText("");
        txtCiu.setEditable(false);
        txtCiu.setText("");
        txtDir.setEditable(false);
        txtDir.setText("");
        txtTel.setEditable(false);
        txtTel.setText("");
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSrcActionPerformed
        radApe.setEnabled(true);
        radCiu.setEnabled(true);
        radTel.setEnabled(true);
        modelo.setRowCount(0);
        btnGrpBusqueda.clearSelection();
        txtDni.setEditable(false);
        txtDni.setText("");
        
        txtNom.setEditable(false);
        txtNom.setText("");
        
        txtApe.setEditable(false);
        txtApe.setText("");
        
        txtCiu.setEditable(false);
        txtCiu.setText("");
        
        txtDir.setEditable(false);
        txtDir.setText("");
        
        txtTel.setEditable(false);
        txtTel.setText("");
        btnAcceptSrc.setEnabled(false);
        btnNew.setEnabled(false);

    }//GEN-LAST:event_btnSrcActionPerformed

    private void radApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radApeActionPerformed
        radCiu.setEnabled(false);
        radTel.setEnabled(false);
        txtApe.setEditable(true);
        txtApe.setEnabled(true);
        txtApe.setBackground(Color.green);
        txtApe.setText("Ingrese un apellido");
        txtApe.requestFocus();
    }//GEN-LAST:event_radApeActionPerformed

    private void txtApeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApeKeyPressed
        if (radApe.isSelected()) {
            while (txtApe.getBackground().equals(Color.green)) {
                txtApe.setBackground(Color.white);
                txtApe.setText("");
            }

            if (!txtApe.getText().isEmpty()) {
                btnAcceptSrc.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtApeKeyPressed

    private void radCiuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radCiuActionPerformed
        radApe.setEnabled(false);
        radTel.setEnabled(false);
        txtCiu.setEditable(true);
        txtCiu.setEnabled(true);
        txtCiu.setBackground(Color.green);
        txtCiu.setText("Ingrese una ciudad");
        txtCiu.requestFocus();
    }//GEN-LAST:event_radCiuActionPerformed

    private void txtCiuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiuKeyPressed
        if (radCiu.isSelected()) {
            while (txtCiu.getBackground().equals(Color.green)) {
                txtCiu.setBackground(Color.white);
                txtCiu.setText("");
            }
            if (!txtCiu.getText().isEmpty()) {
                btnAcceptSrc.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtCiuKeyPressed

    private void radTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radTelActionPerformed
        radCiu.setEnabled(false);
        radApe.setEnabled(false);
        txtTel.setEditable(true);
        txtTel.setEnabled(true);
        txtTel.setBackground(Color.green);
        txtTel.setText("Ingrese un telefono");
        txtTel.requestFocus();
    }//GEN-LAST:event_radTelActionPerformed

    private void txtTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyPressed
        if (radTel.isSelected()) {
            while (txtTel.getBackground().equals(Color.green)) {
                txtTel.setBackground(Color.white);
                txtTel.setText("");
            }
            if (!txtTel.getText().isEmpty()) {
                btnAcceptSrc.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtTelKeyPressed

    private void btnEndSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSrcActionPerformed
        modelo.setRowCount(0);
        btnEndSrc.setEnabled(false);
        btnErase.setEnabled(false);
        txtApe.setText("");
        txtTel.setText("");
        txtCiu.setText("");
        txtApe.setEditable(false);
        txtCiu.setEditable(false);
        txtTel.setEditable(false);
        txtApe.setEnabled(true);
        txtCiu.setEnabled(true);
        txtDir.setEnabled(true);
        txtDni.setEnabled(true);
        txtNom.setEnabled(true);
        txtTel.setEnabled(true);
        btnGrpBusqueda.clearSelection();
        radCiu.setEnabled(false);
        radTel.setEnabled(false);
        radApe.setEnabled(false);
        tabBusq.setEnabled(false);
        scrollBusq.setEnabled(false);
        btnSrc.setEnabled(true);
        btnNew.setEnabled(true);

    }//GEN-LAST:event_btnEndSrcActionPerformed

    private void btnAcceptSrcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptSrcActionPerformed
        btnEndSrc.setEnabled(true);
        tabBusq.setEnabled(true);
        modelo.setRowCount(0);
        btnAcceptSrc.setEnabled(false);
        if (radApe.isSelected()) {
            String apellido = txtApe.getText();
            for (Cliente cliente : entidadesCliente.getListaClientes()) {
                if (cliente.getApellido().equalsIgnoreCase(apellido)) {
                    List<Long> telefonos = entidadesMapa.flitroTelefonos(cliente);
                    for (Long telefono : telefonos) {
                        cargaTabla(telefono, cliente);
                    }
                }
            }
            txtApe.setEditable(false);
            txtApe.setText("");
        }
        if (radCiu.isSelected()) {
            String city = txtCiu.getText();
            for (Cliente cliente : entidadesCliente.getListaClientes()) {
                if (cliente.getCiudad().equalsIgnoreCase(city)) {
                    List<Long> telefonos = entidadesMapa.flitroTelefonos(cliente);
                    for (Long telefono : telefonos) {
                        cargaTabla(telefono, cliente);
                    }
                }
            }
            txtCiu.setEditable(false);
            txtCiu.setText("");
        }

        if (radTel.isEnabled()) {
            scrollBusq.setEnabled(true);
            tabBusq.setEnabled(true);
            Long srcTelefono = Long.valueOf(txtTel.getText());
            Cliente clienteSrc = entidadesMapa.buscarClientePorTelefono(srcTelefono);
            cargaTabla(srcTelefono, clienteSrc);
            txtTel.setEditable(false);
            txtTel.setText("");
        }
        btnSrc.setEnabled(false);
        btnGrpBusqueda.clearSelection();
        radApe.setEnabled(false);
        radCiu.setEnabled(false);
        radTel.setEnabled(false);
    }//GEN-LAST:event_btnAcceptSrcActionPerformed

    private void btnEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraseActionPerformed
        int filaSeleccionada = tabBusq.getSelectedRow();
        Long telefonoTabla = (Long) tabBusq.getValueAt(filaSeleccionada, 0);
        Cliente clienteTabla = entidadesMapa.buscarClientePorTelefono(telefonoTabla);
        entidadesMapa.eliminarRelacion(telefonoTabla);
        entidadesCliente.borrarCliente(clienteTabla);
        entidadesTelefono.borrarTelefono(telefonoTabla);

        modelo.removeRow(filaSeleccionada);
        btnErase.setEnabled(false);


    }//GEN-LAST:event_btnEraseActionPerformed

    private void tabBusqFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabBusqFocusGained
        btnErase.setEnabled(true);
    }//GEN-LAST:event_tabBusqFocusGained

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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptSrc;
    private javax.swing.JButton btnEndSrc;
    private javax.swing.JButton btnErase;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGrpBusqueda;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSrc;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panGeneral;
    private javax.swing.JPanel panSrc;
    private javax.swing.JRadioButton radApe;
    private javax.swing.JRadioButton radCiu;
    private javax.swing.JRadioButton radTel;
    private javax.swing.JScrollPane scrollBusq;
    private javax.swing.JTable tabBusq;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCiu;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void cabeceraTabla() {
        modelo.addColumn("Telefono");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Direccion");
        modelo.addColumn("Ciudad");
        tabBusq.setModel(modelo);
    }

    private void cargaTabla(Long telefono, Cliente cliente) {

        modelo.addRow(new Object[]{
            telefono,
            cliente.getDni(),
            cliente.getNombre(),
            cliente.getApellido(),
            cliente.getDireccion(),
            cliente.getCiudad()
        });

    }

}
