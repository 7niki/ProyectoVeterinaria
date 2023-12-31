package veterinaria.Vistas;

import veterinaria.DesktopPaneWithBackground;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import veterinaria.Entidades.Usuario;

// Clase principal que representa el menú principal de la aplicación
public class Menu extends javax.swing.JFrame {

    // Instancia de DesktopPaneWithBackground que se utilizará como fondo del JFrame
    DesktopPaneWithBackground jEscritorio;
    Usuario currentUserRole;// Rol del usuario actual

    /**
     * Constructor de la clase Menu
     */
    public Menu(Usuario rol) {
        this.currentUserRole = rol;
        // Inicialización de componentes
        initComponents();
        // Agregar el menú al JFrame
        setJMenuBar(getMenu());
        // Configuración del fondo del JFrame
        jEscritorio = new DesktopPaneWithBackground("/veterinaria/Imagenes/HuellaPresentacion.png");
        setContentPane(jEscritorio);

        // Configuración de propiedades del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        pack(); // Ajusta el tamaño inicial según el contenido
        setVisible(true);
    }

      private JMenuBar getMenu() {
        //JMenuBar menuBar = new JMenuBar();
        // Obtener el menú específico para el tipo de usuario actual
        switch (currentUserRole.getRol()) {
        case 0: // ADMINISTRADOR
        jMenuBar1.add(new AdministradorMenu());
        break;
        case 1: // VETERINARIO
        jMenuBar1.add(new VeterinarioMenu());
        break;
       case 2: // ASISTENTE
        jMenuBar1.add(new AsistenteMenu());
        break;
        }
   return jMenuBar1;
    }
        // Clase interna para el menú del Administrador
    private class AdministradorMenu extends JMenu {

        public AdministradorMenu() {
            setTitle("PET DOCTOR -- Usuario Administrador");

        }
    }

    // Clase interna para el menú del Veterinario
    private class VeterinarioMenu extends JMenu {

        public VeterinarioMenu() {
            setTitle("PET DOCTOR -- Usuario Veterinario");

            // Agregar elementos de menú específicos para el Veterinario
              
              jMBarUsuario.setVisible(false);
        }
    }

    // Clase interna para el menú del Asistente
    private class AsistenteMenu extends JMenu {

        public AsistenteMenu() {
            //label.setHorizontalAlignment(JLabel.CENTER);
            setTitle("PET DOCTOR -- Usuario Asistente");

            // Agregar elementos de menú específicos para el Asistente
               jMBarUsuario.setVisible(false);
               jMIOtros.setVisible(false);
        }
    }
    
    // Método principal para iniciar la aplicación
//    public static void main(String args[]) {
//      //  SwingUtilities.invokeLater(Menu::new);
//    }

    /**
     * Método generado automáticamente para inicializar los componentes dentro
     * del JFrame. Este método es generado por el editor visual de NetBeans.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jBarClientes = new javax.swing.JMenu();
        jMIBuscar = new javax.swing.JMenuItem();
        jMINuevo = new javax.swing.JMenuItem();
        jBarMascotas = new javax.swing.JMenu();
        jMIBuscarMascotas = new javax.swing.JMenuItem();
        jMINuevaMasc = new javax.swing.JMenuItem();
        jMbarAdm = new javax.swing.JMenu();
        jMIVisitas = new javax.swing.JMenuItem();
        jMITratam = new javax.swing.JMenuItem();
        jMIOtros = new javax.swing.JMenuItem();
        jMIReservas = new javax.swing.JMenuItem();
        jMBarFacturacion = new javax.swing.JMenu();
        jMICosto = new javax.swing.JMenuItem();
        jMBarUsuario = new javax.swing.JMenu();
        jMIRegisUsuarios = new javax.swing.JMenuItem();
        jMBarSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PET DOCTOR");
        setBackground(new java.awt.Color(255, 255, 255));

        jBarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/people_114360.png"))); // NOI18N
        jBarClientes.setText("Clientes");

        jMIBuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMIBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/free-30-instagram-stories-icons23_122570.png"))); // NOI18N
        jMIBuscar.setText("Buscar");
        jMIBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarActionPerformed(evt);
            }
        });
        jBarClientes.add(jMIBuscar);

        jMINuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMINuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/free-30-instagram-stories-icons53_122600.png"))); // NOI18N
        jMINuevo.setText("Nuevo");
        jMINuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINuevoActionPerformed(evt);
            }
        });
        jBarClientes.add(jMINuevo);

        jMenuBar1.add(jBarClientes);

        jBarMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/labrador_dog_animal_15967.png"))); // NOI18N
        jBarMascotas.setText("Mascotas");

        jMIBuscarMascotas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMIBuscarMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/free-30-instagram-stories-icons21_122568.png"))); // NOI18N
        jMIBuscarMascotas.setText("Buscar");
        jMIBuscarMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIBuscarMascotasActionPerformed(evt);
            }
        });
        jBarMascotas.add(jMIBuscarMascotas);

        jMINuevaMasc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMINuevaMasc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/free-30-instagram-stories-icons51_122598.png"))); // NOI18N
        jMINuevaMasc.setText("Nueva");
        jMINuevaMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMINuevaMascActionPerformed(evt);
            }
        });
        jBarMascotas.add(jMINuevaMasc);

        jMenuBar1.add(jBarMascotas);

        jMbarAdm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/pet_folder_file_document_page_icon_124627.png"))); // NOI18N
        jMbarAdm.setText("Administracion");
        jMbarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMbarAdmActionPerformed(evt);
            }
        });

        jMIVisitas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMIVisitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/checklist_medical_healthcare_pen_clipboard_clipchart_icon_142002.png"))); // NOI18N
        jMIVisitas.setText("Visitas");
        jMIVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVisitasActionPerformed(evt);
            }
        });
        jMbarAdm.add(jMIVisitas);

        jMITratam.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMITratam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/medical-12_icon-icons.com_73944.png"))); // NOI18N
        jMITratam.setText("Tratamiento");
        jMITratam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMITratamActionPerformed(evt);
            }
        });
        jMbarAdm.add(jMITratam);

        jMIOtros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMIOtros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/household_chores_feeding_pet_feed_dog_food_icon_133347.png"))); // NOI18N
        jMIOtros.setText("Historial");
        jMIOtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOtrosActionPerformed(evt);
            }
        });
        jMbarAdm.add(jMIOtros);

        jMIReservas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMIReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/artboard-10_89054.png"))); // NOI18N
        jMIReservas.setText("Reservas turnos");
        jMIReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReservasActionPerformed(evt);
            }
        });
        jMbarAdm.add(jMIReservas);

        jMenuBar1.add(jMbarAdm);

        jMBarFacturacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/budget256_24775.png"))); // NOI18N
        jMBarFacturacion.setText("Facturacion");

        jMICosto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMICosto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/pet_rat_mouse_11098.png"))); // NOI18N
        jMICosto.setText("Costo visita");
        jMICosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICostoActionPerformed(evt);
            }
        });
        jMBarFacturacion.add(jMICosto);

        jMenuBar1.add(jMBarFacturacion);

        jMBarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/rotation_102346.png"))); // NOI18N
        jMBarUsuario.setText("Usuarios");

        jMIRegisUsuarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMIRegisUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/people_114360.png"))); // NOI18N
        jMIRegisUsuarios.setText("Usuarios");
        jMIRegisUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIRegisUsuariosActionPerformed(evt);
            }
        });
        jMBarUsuario.add(jMIRegisUsuarios);

        jMenuBar1.add(jMBarUsuario);

        jMBarSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/veterinaria/Imagenes/477A86B10B034C3087ADC368774218B1.png"))); // NOI18N
        jMBarSalir.setText("Salir");
        jMBarSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMBarSalirMouseClicked(evt);
            }
        });
        jMBarSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMBarSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMBarSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Acción cuando se selecciona "Buscar" en el menú de Clientes
    private void jMIBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarActionPerformed
        // Crear y mostrar el formulario para buscar clientes
        jEscritorio.removeAll();
        jEscritorio.repaint();

        FormularioClienteBuscar cargarCliente = new FormularioClienteBuscar(jEscritorio);

        cargarCliente.setSize(600, 500);

        int x = (jEscritorio.getWidth() - cargarCliente.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - cargarCliente.getHeight()) / 2;

        cargarCliente.setBounds(x, y, cargarCliente.getWidth(), cargarCliente.getHeight());
        jEscritorio.add(cargarCliente);
        cargarCliente.setVisible(true);
    }//GEN-LAST:event_jMIBuscarActionPerformed
    // Acción cuando se selecciona "Nueva" en el menú de Mascotas
    private void jMINuevaMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINuevaMascActionPerformed
        // Crear y mostrar el formulario para agregar una nueva mascota
        try {
            jEscritorio.removeAll();
            jEscritorio.repaint();

            FormularioMascotas cargarMascotas = new FormularioMascotas(0);

            // Configurar el tamaño del JInternalFrame
            cargarMascotas.setSize(600, 500);
            cargarMascotas.pack();
            // Calcular el centro del JDesktopPane
            int x = (jEscritorio.getWidth() - cargarMascotas.getWidth()) / 2;
            int y = (jEscritorio.getHeight() - cargarMascotas.getHeight()) / 2;
            // Establecer la ubicación y agregar el JInternalFrame
            cargarMascotas.setBounds(x, y, cargarMascotas.getWidth(), cargarMascotas.getHeight());
            jEscritorio.add(cargarMascotas);
            cargarMascotas.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMINuevaMascActionPerformed
// Acción cuando se selecciona "Tratamiento" en el menú de Administración
    private void jMITratamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMITratamActionPerformed
// Crear y mostrar el formulario para gestionar tratamientos
        jEscritorio.removeAll();
        jEscritorio.repaint();

        FormularioTratamiento cargarCliente = new FormularioTratamiento();

        cargarCliente.setSize(600, 500);

        int x = (jEscritorio.getWidth() - cargarCliente.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - cargarCliente.getHeight()) / 2;

        cargarCliente.setBounds(x, y, cargarCliente.getWidth(), cargarCliente.getHeight());
        jEscritorio.add(cargarCliente);
        cargarCliente.setVisible(true);

     
    }//GEN-LAST:event_jMITratamActionPerformed
 // Acción cuando se selecciona "Historial" en el menú de Administración
    private void jMIOtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOtrosActionPerformed
        // Crear y mostrar el formulario para ver el historial
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioListados historial = new FormularioListados();
        // Configurar el tamaño del JInternalFrame
        historial.setSize(600, 500);
        historial.pack();
        // Calcular el centro del JDesktopPane
        int x = (jEscritorio.getWidth() - historial.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - historial.getHeight()) / 2;
        // Establecer la ubicación y agregar el JInternalFrame
        historial.setBounds(x, y, historial.getWidth(), historial.getHeight());
        jEscritorio.add(historial);
        historial.setVisible(true);
    }//GEN-LAST:event_jMIOtrosActionPerformed

    private void jMINuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMINuevoActionPerformed
         
        jEscritorio.removeAll();
        jEscritorio.repaint();

        FormularioCliente cargarCliente = new FormularioCliente(jEscritorio);
        

        cargarCliente.setSize(600, 500);

        int x = (jEscritorio.getWidth() - cargarCliente.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - cargarCliente.getHeight()) / 2;

        cargarCliente.setBounds(x, y, cargarCliente.getWidth(), cargarCliente.getHeight());
        jEscritorio.add(cargarCliente);
        cargarCliente.setVisible(true);
    }//GEN-LAST:event_jMINuevoActionPerformed

    private void jMbarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMbarAdmActionPerformed

        
    }//GEN-LAST:event_jMbarAdmActionPerformed
// Acción cuando se selecciona "Visitas" en el menú de Administración
    private void jMIVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVisitasActionPerformed
       // Crear y mostrar el formulario para gestionar visitas
        jEscritorio.removeAll();
        jEscritorio.repaint();
        FormularioVisitas visitas = new FormularioVisitas(jEscritorio);
               visitas.setSize(600, 500);
        visitas.pack();
        // Calcular el centro del JDesktopPane
        int x = (jEscritorio.getWidth() - visitas.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - visitas.getHeight()) / 2;
        // Establecer la ubicación y agregar el JInternalFrame
        visitas.setBounds(x, y, visitas.getWidth(), visitas.getHeight());
        jEscritorio.add(visitas);
        visitas.setVisible(true);
    }//GEN-LAST:event_jMIVisitasActionPerformed
// Acción cuando se selecciona "Buscar" en el menú de Mascotas
    private void jMIBuscarMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIBuscarMascotasActionPerformed
        // Crear y mostrar el formulario para buscar mascotas
        try {
            jEscritorio.removeAll();
            jEscritorio.repaint();
            //jEscritorio.add(jLULP);
            // FormularioMascotasCopia cargarMascotas = null;

            FormularioMascotasBuscar buscarMascotas = new FormularioMascotasBuscar(0);

            // Configurar el tamaño del JInternalFrame
            buscarMascotas.setSize(600, 500);
            buscarMascotas.pack();
            // Calcular el centro del JDesktopPane
            int x = (jEscritorio.getWidth() - buscarMascotas.getWidth()) / 2;
            int y = (jEscritorio.getHeight() - buscarMascotas.getHeight()) / 2;
            // Establecer la ubicación y agregar el JInternalFrame
            buscarMascotas.setBounds(x, y, buscarMascotas.getWidth(), buscarMascotas.getHeight());
            jEscritorio.add(buscarMascotas);
            buscarMascotas.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIBuscarMascotasActionPerformed

    private void jMIReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReservasActionPerformed
        // Reservas
         jEscritorio.removeAll();
        jEscritorio.repaint();
        //jEscritorio.add(jLULP);
        Calendario calendario = new Calendario();
        // Configurar el tamaño del JInternalFrame
        calendario.setSize(600, 500);
        calendario.pack();
        // Calcular el centro del JDesktopPane
        int x = (jEscritorio.getWidth() - calendario.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - calendario.getHeight()) / 2;
        // Establecer la ubicación y agregar el JInternalFrame
        calendario.setBounds(x, y, calendario.getWidth(), calendario.getHeight());
        jEscritorio.add(calendario);
        calendario.setVisible(true);
        
        
    }//GEN-LAST:event_jMIReservasActionPerformed

    private void jMICostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICostoActionPerformed
        // Facturacion
        
        jEscritorio.removeAll();
        jEscritorio.repaint();
        //jEscritorio.add(jLULP);
        FormularioFacturacion facturacion = new FormularioFacturacion();
        // Configurar el tamaño del JInternalFrame
       facturacion.setSize(600, 500);
        facturacion.pack();
        // Calcular el centro del JDesktopPane
        int x = (jEscritorio.getWidth() - facturacion.getWidth()) / 2;
        int y = (jEscritorio.getHeight() - facturacion.getHeight()) / 2;
        // Establecer la ubicación y agregar el JInternalFrame
        facturacion.setBounds(x, y, facturacion.getWidth(), facturacion.getHeight());
        jEscritorio.add(facturacion);
        facturacion.setVisible(true);
    }//GEN-LAST:event_jMICostoActionPerformed

    private void jMIRegisUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIRegisUsuariosActionPerformed
          
 // Crear y mostrar el formulario para gestionar visitas
             jEscritorio.removeAll();
             jEscritorio.repaint();
             RegistroUsuarios usuario = new RegistroUsuarios(jEscritorio);
             usuario.setSize(600, 500);
             usuario.pack();
             // Calcular el centro del JDesktopPane
             int x = (jEscritorio.getWidth() - usuario.getWidth()) / 2;
             int y = (jEscritorio.getHeight() - usuario.getHeight()) / 2;
             // Establecer la ubicación y agregar el JInternalFrame
             usuario.setBounds(x, y, usuario.getWidth(), usuario.getHeight());
             jEscritorio.add(usuario);
             usuario.setVisible(true);
         // TODO add your handling code here:
    }//GEN-LAST:event_jMIRegisUsuariosActionPerformed

    private void jMBarSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMBarSalirActionPerformed
        salir();
    }//GEN-LAST:event_jMBarSalirActionPerformed

    private void jMBarSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMBarSalirMouseClicked
        // TODO add your handling code here:
        salir();
    }//GEN-LAST:event_jMBarSalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jBarClientes;
    private javax.swing.JMenu jBarMascotas;
    private javax.swing.JMenu jMBarFacturacion;
    private javax.swing.JMenu jMBarSalir;
    private javax.swing.JMenu jMBarUsuario;
    private javax.swing.JMenuItem jMIBuscar;
    private javax.swing.JMenuItem jMIBuscarMascotas;
    private javax.swing.JMenuItem jMICosto;
    private javax.swing.JMenuItem jMINuevaMasc;
    private javax.swing.JMenuItem jMINuevo;
    private javax.swing.JMenuItem jMIOtros;
    private javax.swing.JMenuItem jMIRegisUsuarios;
    private javax.swing.JMenuItem jMIReservas;
    private javax.swing.JMenuItem jMITratam;
    private javax.swing.JMenuItem jMIVisitas;
    private javax.swing.JMenu jMbarAdm;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    
    private void salir() {
        int respuesta = JOptionPane.showConfirmDialog(this, "Estas seguro que "
                + "quieres salir?", "Salir de la aplicacion", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
