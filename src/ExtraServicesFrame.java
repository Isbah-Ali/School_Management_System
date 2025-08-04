import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExtraServicesFrame extends JFrame {

    // Labels to show selected options
    private JLabel lblFeesValue, lblTransportValue, lblHostelValue;

    // Checkboxes for options
    private JCheckBox cbFees, cbTransport, cbHostel;

    // Button to save selections
    private JButton btnSave;

    // Model to store selections (Builder pattern style)
    static class Services {
        private boolean fees;
        private boolean transport;
        private boolean hostel;

        private Services(Builder builder) {
            this.fees = builder.fees;
            this.transport = builder.transport;
            this.hostel = builder.hostel;
        }

        public static class Builder {
            private boolean fees = false;
            private boolean transport = false;
            private boolean hostel = false;

            public Builder setFees(boolean fees) {
                this.fees = fees;
                return this;
            }

            public Builder setTransport(boolean transport) {
                this.transport = transport;
                return this;
            }

            public Builder setHostel(boolean hostel) {
                this.hostel = hostel;
                return this;
            }

            public Services build() {
                return new Services(this);
            }
        }

        @Override
        public String toString() {
            return "Fees: " + (fees ? "Yes" : "No") + ", Transport: " + (transport ? "Yes" : "No") + ", Hostel: " + (hostel ? "Yes" : "No");
        }
    }

    private Services currentServices;

    public ExtraServicesFrame() {
        setTitle("Select Extra Services");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        initUI();
    }

    private void initUI() {
        // Panel with blue background
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(0, 120, 215)); // nice blue
        mainPanel.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 15, 10, 15);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Row 0 - Fees
        JLabel lblFees = new JLabel("Fees:");
        lblFees.setForeground(Color.WHITE);
        lblFees.setFont(new Font("Segoe UI", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(lblFees, gbc);

        cbFees = new JCheckBox();
        cbFees.setBackground(new Color(0, 120, 215));
        gbc.gridx = 1;
        mainPanel.add(cbFees, gbc);

        lblFeesValue = new JLabel("No");
        lblFeesValue.setForeground(Color.WHITE);
        gbc.gridx = 2;
        mainPanel.add(lblFeesValue, gbc);

        // Row 1 - Transport
        JLabel lblTransport = new JLabel("Transport:");
        lblTransport.setForeground(Color.WHITE);
        lblTransport.setFont(new Font("Segoe UI", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(lblTransport, gbc);

        cbTransport = new JCheckBox();
        cbTransport.setBackground(new Color(0, 120, 215));
        gbc.gridx = 1;
        mainPanel.add(cbTransport, gbc);

        lblTransportValue = new JLabel("No");
        lblTransportValue.setForeground(Color.WHITE);
        gbc.gridx = 2;
        mainPanel.add(lblTransportValue, gbc);

        // Row 2 - Hostel
        JLabel lblHostel = new JLabel("Hostel:");
        lblHostel.setForeground(Color.WHITE);
        lblHostel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 2;
        mainPanel.add(lblHostel, gbc);

        cbHostel = new JCheckBox();
        cbHostel.setBackground(new Color(0, 120, 215));
        gbc.gridx = 1;
        mainPanel.add(cbHostel, gbc);

        lblHostelValue = new JLabel("No");
        lblHostelValue.setForeground(Color.WHITE);
        gbc.gridx = 2;
        mainPanel.add(lblHostelValue, gbc);

        // Row 3 - Save button
        btnSave = new JButton("Save");
        btnSave.setFont(new Font("Segoe UI", Font.BOLD, 14));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(btnSave, gbc);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveServices();
            }
        });

        add(mainPanel);
    }

    private void saveServices() {
        // Build the services object
        currentServices = new Services.Builder()
                .setFees(cbFees.isSelected())
                .setTransport(cbTransport.isSelected())
                .setHostel(cbHostel.isSelected())
                .build();

        // Update labels
        lblFeesValue.setText(currentServices.fees ? "Yes" : "No");
        lblTransportValue.setText(currentServices.transport ? "Yes" : "No");
        lblHostelValue.setText(currentServices.hostel ? "Yes" : "No");

        JOptionPane.showMessageDialog(this, "Services saved:\n" + currentServices.toString(), "Saved", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        // Run UI in Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            ExtraServicesFrame frame = new ExtraServicesFrame();
            frame.setVisible(true);
        });
    }
}
