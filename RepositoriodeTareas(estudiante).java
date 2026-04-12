     if (idTareaSeleccionada == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona una tarea primero.");
            return;
        }

        try {
            Connection con = Conexiobd.Conexion();
            String sql = "SELECT ruta_archivo FROM Archivo_tarea WHERE id_tarea = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idTareaSeleccionada);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String url = rs.getString("ruta_archivo");
                java.awt.Desktop.getDesktop().browse(new java.net.URI(url));
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Esta tarea no tiene archivo adjunto.");
            }

            con.close();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se pudo abrir: " + e.getMessage());
        } 
    }                                              

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                               
      jPanel6.setVisible(true);
    }                                       
