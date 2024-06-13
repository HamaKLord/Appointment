package appointment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private String doctorId;
    private Date appointmentDate;
    private String appointmentTime;

    // Association: An appointment is associated with a patient and a doctor
    public Appointment(String appointmentId, String patientId, String doctorId, Date appointmentDate, String appointmentTime) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    // Getters and Setters
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }
}





 class MainApp extends JFrame {
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private List<Doctor> doctorList;
    private String patientName, patientAge, sickness, sicknessDesc, selectedDoctor;
    private boolean isEmergency;

    public MainApp() {
        setTitle("Medical Appointment System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize doctors list
        doctorList = new ArrayList<>();
        doctorList.add(new Doctor("D001", "Dr. Smith", "Cardiology", "Board-certified in cardiology"));
        doctorList.add(new Doctor("D002", "Dr. Johnson", "Neurology", "Expert in neurological disorders"));
        doctorList.add(new Doctor("D003", "Dr. Williams", "Dermatology", "Board-certified in dermatology"));
        doctorList.add(new Doctor("D004", "Dr. Brown", "Orthopedics", "Specialist in orthopedic surgery"));
        doctorList.add(new Doctor("D005", "Dr. Taylor", "Pediatrics", "Board-certified in pediatrics"));

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        JPanel loginPanel = createLoginPanel();
        JPanel signupPanel = createSignupPanel();
        JPanel patientInfoPanel = createPatientInfoPanel();
        JPanel paymentTypePanel = createPaymentTypePanel();
        JPanel creditCardPaymentPanel = createCreditCardPaymentPanel();
        JPanel paypalPaymentPanel = createPayPalPaymentPanel();
        JPanel feedbackPanel = createFeedbackPanel();

        mainPanel.add(loginPanel, "login");
        mainPanel.add(signupPanel, "signup");
        mainPanel.add(patientInfoPanel, "patientInfo");
        mainPanel.add(paymentTypePanel, "paymentType");
        mainPanel.add(creditCardPaymentPanel, "creditCardPayment");
        mainPanel.add(paypalPaymentPanel, "paypalPayment");
        mainPanel.add(feedbackPanel, "feedback");

        add(mainPanel);
        cardLayout.show(mainPanel, "login");
    }

    private JPanel createLoginPanel() {
        JPanel loginPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel usernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        loginPanel.add(usernameLabel, gbc);

        JTextField usernameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        loginPanel.add(usernameField, gbc);

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        loginPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        loginPanel.add(passwordField, gbc);

        JButton loginButton = new JButton("Login");
        gbc.gridx = 0;
        gbc.gridy = 2;
        loginPanel.add(loginButton, gbc);

        JButton signupButton = new JButton("Signup");
        gbc.gridx = 1;
        gbc.gridy = 2;
        loginPanel.add(signupButton, gbc);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle login logic here
                JOptionPane.showMessageDialog(MainApp.this, "Login Successful");
                cardLayout.show(mainPanel, "patientInfo");
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "signup");
            }
        });

        return loginPanel;
    }

    private JPanel createSignupPanel() {
        JPanel signupPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel signupUsernameLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        signupPanel.add(signupUsernameLabel, gbc);

        JTextField signupUsernameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        signupPanel.add(signupUsernameField, gbc);

        JLabel signupPasswordLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        signupPanel.add(signupPasswordLabel, gbc);

        JPasswordField signupPasswordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        signupPanel.add(signupPasswordField, gbc);

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        signupPanel.add(confirmPasswordLabel, gbc);

        JPasswordField confirmPasswordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        signupPanel.add(confirmPasswordField, gbc);

        JLabel locationLabel = new JLabel("Location:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        signupPanel.add(locationLabel, gbc);

        JTextField locationField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        signupPanel.add(locationField, gbc);

        JButton createAccountButton = new JButton("Create Account");
        gbc.gridx = 0;
        gbc.gridy = 4;
        signupPanel.add(createAccountButton, gbc);

        JButton backButton = new JButton("Back");
        gbc.gridx = 1;
        gbc.gridy = 4;
        signupPanel.add(backButton, gbc);

        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle signup logic here
                JOptionPane.showMessageDialog(MainApp.this, "Account Created Successfully");
                cardLayout.show(mainPanel, "login");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "login");
            }
        });

        return signupPanel;
    }

    private JPanel createPatientInfoPanel() {
        JPanel patientInfoPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel patientNameLabel = new JLabel("Patient Name:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        patientInfoPanel.add(patientNameLabel, gbc);

        JTextField patientNameField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        patientInfoPanel.add(patientNameField, gbc);

        JLabel patientAgeLabel = new JLabel("Patient Age:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        patientInfoPanel.add(patientAgeLabel, gbc);

        JTextField patientAgeField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        patientInfoPanel.add(patientAgeField, gbc);

        JLabel sicknessLabel = new JLabel("Type of Sickness:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        patientInfoPanel.add(sicknessLabel, gbc);

        JTextField sicknessField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        patientInfoPanel.add(sicknessField, gbc);

        JLabel sicknessDescLabel = new JLabel("Description of Sickness:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        patientInfoPanel.add(sicknessDescLabel, gbc);

        JTextArea sicknessDescArea = new JTextArea(3, 20);
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        patientInfoPanel.add(new JScrollPane(sicknessDescArea), gbc);

        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel emergencyLabel = new JLabel("Is it an emergency?");
        gbc.gridx = 0;
        gbc.gridy = 4;
        patientInfoPanel.add(emergencyLabel, gbc);

        JCheckBox emergencyCheckBox = new JCheckBox();
        gbc.gridx = 1;
        gbc.gridy = 4;
        patientInfoPanel.add(emergencyCheckBox, gbc);

        JLabel doctorLabel = new JLabel("Select Doctor:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        patientInfoPanel.add(doctorLabel, gbc);

        JComboBox<String> doctorComboBox = new JComboBox<>();
        for (Doctor doctor : doctorList) {
            doctorComboBox.addItem(doctor.getName() + " - " + doctor.getSpecialty() + ": " + doctor.getDescription());
        }
        gbc.gridx = 1;
        gbc.gridy = 5;
        patientInfoPanel.add(doctorComboBox, gbc);

        JButton nextButton = new JButton("Next");
        gbc.gridx = 0;
        gbc.gridy = 6;
        patientInfoPanel.add(nextButton, gbc);

        JButton backToLoginButton = new JButton("Back");
        gbc.gridx = 1;
        gbc.gridy = 6;
        patientInfoPanel.add(backToLoginButton, gbc);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                patientName = patientNameField.getText();
                patientAge = patientAgeField.getText();
                sickness = sicknessField.getText();
                sicknessDesc = sicknessDescArea.getText();
                isEmergency = emergencyCheckBox.isSelected();
                selectedDoctor = (String) doctorComboBox.getSelectedItem();

                // Store the patient information in a Payment panel
                cardLayout.show(mainPanel, "paymentType");
            }
        });

        backToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "login");
            }
        });

        return patientInfoPanel;
    }

    private JPanel createPaymentTypePanel() {
        JPanel paymentTypePanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel paymentLabel = new JLabel("Payment Amount: $10");
        gbc.gridx = 0;
        gbc.gridy = 0;
        paymentTypePanel.add(paymentLabel, gbc);

        JLabel paymentTypeLabel = new JLabel("Payment Type:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        paymentTypePanel.add(paymentTypeLabel, gbc);

        JComboBox<String> paymentTypeComboBox = new JComboBox<>(new String[]{"Credit Card", "Debit Card", "PayPal"});
        gbc.gridx = 1;
        gbc.gridy = 1;
        paymentTypePanel.add(paymentTypeComboBox, gbc);

        JButton nextButton = new JButton("Next");
        gbc.gridx = 0;
        gbc.gridy = 2;
        paymentTypePanel.add(nextButton, gbc);

        JButton backButton = new JButton("Back");
        gbc.gridx = 1;
        gbc.gridy = 2;
        paymentTypePanel.add(backButton, gbc);

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String paymentType = (String) paymentTypeComboBox.getSelectedItem();
                if (paymentType.equals("Credit Card") || paymentType.equals("Debit Card")) {
                    cardLayout.show(mainPanel, "creditCardPayment");
                } else if (paymentType.equals("PayPal")) {
                    cardLayout.show(mainPanel, "paypalPayment");
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "patientInfo");
            }
        });

        return paymentTypePanel;
    }

    private JPanel createCreditCardPaymentPanel() {
        JPanel creditCardPaymentPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel cardNumberLabel = new JLabel("Card Number:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        creditCardPaymentPanel.add(cardNumberLabel, gbc);

        JTextField cardNumberField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        creditCardPaymentPanel.add(cardNumberField, gbc);

        JLabel expiryDateLabel = new JLabel("Expiry Date (MM/YY):");
        gbc.gridx = 0;
        gbc.gridy = 1;
        creditCardPaymentPanel.add(expiryDateLabel, gbc);

        JTextField expiryDateField = new JTextField(5);
        gbc.gridx = 1;
        gbc.gridy = 1;
        creditCardPaymentPanel.add(expiryDateField, gbc);

        JLabel cvvLabel = new JLabel("CVV:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        creditCardPaymentPanel.add(cvvLabel, gbc);

        JTextField cvvField = new JTextField(3);
        gbc.gridx = 1;
        gbc.gridy = 2;
        creditCardPaymentPanel.add(cvvField, gbc);

        JButton payButton = new JButton("Pay");
        gbc.gridx = 0;
        gbc.gridy = 3;
        creditCardPaymentPanel.add(payButton, gbc);

        JButton backButton = new JButton("Back");
        gbc.gridx = 1;
        gbc.gridy = 3;
        creditCardPaymentPanel.add(backButton, gbc);

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate appointment date and time
                Date appointmentDate;
                if (isEmergency) {
                    appointmentDate = new Date(System.currentTimeMillis() + 2 * 60 * 60 * 1000); // 2 hours later for emergency
                } else {
                    appointmentDate = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000); // 1 day later for non-emergency
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String appointmentDateTime = sdf.format(appointmentDate);

                // Generate virtual visit link
                String visitLink = "https://virtualvisit.example.com/appointment/" + patientName.replaceAll(" ", "_");

                // Handle payment and display appointment details
                JOptionPane.showMessageDialog(MainApp.this, "Payment Successful! Your appointment details:\nName: " + patientName + "\nAge: " + patientAge + "\nSickness: " + sickness + "\nDescription: " + sicknessDesc + "\nDoctor: " + selectedDoctor + "\nAppointment Date and Time: " + appointmentDateTime + "\nVisit Link: " + visitLink);

                // Store the appointment details in a Feedback panel
                cardLayout.show(mainPanel, "feedback");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "paymentType");
            }
        });

        return creditCardPaymentPanel;
    }

    private JPanel createPayPalPaymentPanel() {
        JPanel paypalPaymentPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel emailLabel = new JLabel("PayPal Email:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        paypalPaymentPanel.add(emailLabel, gbc);

        JTextField emailField = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        paypalPaymentPanel.add(emailField, gbc);

        JLabel passwordLabel = new JLabel("PayPal Password:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        paypalPaymentPanel.add(passwordLabel, gbc);

        JPasswordField passwordField = new JPasswordField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        paypalPaymentPanel.add(passwordField, gbc);

        JButton payButton = new JButton("Pay");
        gbc.gridx = 0;
        gbc.gridy = 2;
        paypalPaymentPanel.add(payButton, gbc);

        JButton backButton = new JButton("Back");
        gbc.gridx = 1;
        gbc.gridy = 2;
        paypalPaymentPanel.add(backButton, gbc);

        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Generate appointment date and time
                Date appointmentDate;
                if (isEmergency) {
                    appointmentDate = new Date(System.currentTimeMillis() + 2 * 60 * 60 * 1000); // 2 hours later for emergency
                } else {
                    appointmentDate = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000); // 1 day later for non-emergency
                }
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String appointmentDateTime = sdf.format(appointmentDate);

                // Generate virtual visit link
                String visitLink = "https://virtualvisit.example.com/appointment/" + patientName.replaceAll(" ", "_");

                // Handle payment and display appointment details
                JOptionPane.showMessageDialog(MainApp.this, "Payment Successful! Your appointment details:\nName: " + patientName + "\nAge: " + patientAge + "\nSickness: " + sickness + "\nDescription: " + sicknessDesc + "\nDoctor: " + selectedDoctor + "\nAppointment Date and Time: " + appointmentDateTime + "\nVisit Link: " + visitLink);

                // Store the appointment details in a Feedback panel
                cardLayout.show(mainPanel, "feedback");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "paymentType");
            }
        });

        return paypalPaymentPanel;
    }

    private JPanel createFeedbackPanel() {
        JPanel feedbackPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel feedbackLabel = new JLabel("Leave your feedback and rating:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        feedbackPanel.add(feedbackLabel, gbc);
        gbc.gridwidth = 1;

        JLabel ratingLabel = new JLabel("Rating (1-5):");
        gbc.gridx = 0;
        gbc.gridy = 1;
        feedbackPanel.add(ratingLabel, gbc);

        JComboBox<Integer> ratingComboBox = new JComboBox<>(new Integer[]{1, 2, 3, 4, 5});
        gbc.gridx = 1;
        gbc.gridy = 1;
        feedbackPanel.add(ratingComboBox, gbc);

        JLabel feedbackTextLabel = new JLabel("Feedback:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        feedbackPanel.add(feedbackTextLabel, gbc);

        JTextArea feedbackTextArea = new JTextArea(3, 20);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        feedbackPanel.add(new JScrollPane(feedbackTextArea), gbc);
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JButton submitFeedbackButton = new JButton("Submit Feedback");
        gbc.gridx = 0;
        gbc.gridy = 3;
        feedbackPanel.add(submitFeedbackButton, gbc);

        JButton backToLoginButton = new JButton("Back to Login");
        gbc.gridx = 1;
        gbc.gridy = 3;
        feedbackPanel.add(backToLoginButton, gbc);

        submitFeedbackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rating = (Integer) ratingComboBox.getSelectedItem();
                String feedback = feedbackTextArea.getText();

                // Handle feedback submission logic here
                JOptionPane.showMessageDialog(MainApp.this, "Thank you for your feedback!\nRating: " + rating + "\nFeedback: " + feedback);

                // Redirect to login page
                cardLayout.show(mainPanel, "login");
            }
        });

        backToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "login");
            }
        });

        return feedbackPanel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }
}
