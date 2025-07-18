/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.miscillenious;

/**
 *
 * @author Student
 */
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class FileCompressorUI extends JFrame {
    private JTextField filePathField = new JTextField(30);
    private JButton browseButton = new JButton("Browse");
    private JButton compressButton = new JButton("Compress");

    public FileCompressorUI() {
        super("Simple File Compressor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 150);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel filePanel = new JPanel();
        filePanel.add(new JLabel("File:"));
        filePanel.add(filePathField);
        filePanel.add(browseButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(compressButton);

        add(filePanel);
        add(buttonPanel);

        browseButton.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                filePathField.setText(fc.getSelectedFile().getAbsolutePath());
            }
        });

        compressButton.addActionListener(e -> {
            String inputFile = filePathField.getText();
            if (inputFile.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Select a file first.");
                return;
            }
            String outputFile = inputFile + ".gz";
            try (
                FileInputStream fis = new FileInputStream(inputFile);
                FileOutputStream fos = new FileOutputStream(outputFile);
                GZIPOutputStream gzipOut = new GZIPOutputStream(fos)
            ) {
                byte[] buffer = new byte[1024];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    gzipOut.write(buffer, 0, len);
                }
                JOptionPane.showMessageDialog(this, "Compression complete:\n" + outputFile);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FileCompressorUI::new);
    }
}

