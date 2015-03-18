/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Nazlı
 */
public class StudentWindow extends javax.swing.JFrame {

    /**
     * Creates new form StrudentWindow
     */
    public StudentWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentWindowMainPanel = new javax.swing.JPanel();
        studentWindowSubPanel = new javax.swing.JPanel();
        personalInfoPanel = new javax.swing.JPanel();
        personalInfoLabel = new javax.swing.JLabel();
        personalInfoNameLabel = new javax.swing.JLabel();
        personalInfoSurnameLabel = new javax.swing.JLabel();
        personalInfoNationalIDLabel = new javax.swing.JLabel();
        personalInfoGenderLabel = new javax.swing.JLabel();
        personalInfoPhoneLabel = new javax.swing.JLabel();
        personalInfoMailLabel = new javax.swing.JLabel();
        personalInfoBirthdayLabel = new javax.swing.JLabel();
        personalInfoNameText = new javax.swing.JTextField();
        personalInfoSurnameText = new javax.swing.JTextField();
        personalInfoNationalIDText = new javax.swing.JTextField();
        personalInfoPhoneText = new javax.swing.JTextField();
        personalInfoMailComboBox = new javax.swing.JTextField();
        personalInfoDayComboBox = new javax.swing.JComboBox();
        personalInfoMounthComboBox = new javax.swing.JComboBox();
        personalInfoYearComboBox = new javax.swing.JComboBox();
        personalInfoGenderComboBox = new javax.swing.JComboBox();
        emergencyContactPanel = new javax.swing.JPanel();
        emergencyContactLabel = new javax.swing.JLabel();
        emergencyContactNameLabel = new javax.swing.JLabel();
        emergencyContactSurnameLabel = new javax.swing.JLabel();
        emergencyContactPhoneLabel = new javax.swing.JLabel();
        emergencyContactNameText = new javax.swing.JTextField();
        emergencyContactSurnameText = new javax.swing.JTextField();
        emergencyContactPhoneText = new javax.swing.JTextField();
        schoolInfoPanel = new javax.swing.JPanel();
        schoolInfoLabel = new javax.swing.JLabel();
        schoolInfoUniversityLabel = new javax.swing.JLabel();
        schoolInfoDepartmentLabel = new javax.swing.JLabel();
        schoolInfoGradeLabel = new javax.swing.JLabel();
        schoolInfoUniversityText = new javax.swing.JTextField();
        schoolInfoDepartmentText = new javax.swing.JTextField();
        schoolInfoGradeText = new javax.swing.JTextField();
        accoInfoPanel = new javax.swing.JPanel();
        accoInfoLabel = new javax.swing.JLabel();
        accoInfoDormLabel = new javax.swing.JLabel();
        accoInfoRoomLabel = new javax.swing.JLabel();
        accoInfoDormComboBox = new javax.swing.JComboBox();
        accoInfoRoomComboBox = new javax.swing.JComboBox();
        accoInfoStartDateLabel = new javax.swing.JLabel();
        accoInfoEndDateLabel = new javax.swing.JLabel();
        accoInfoStartDateText = new javax.swing.JTextField();
        accoInfoEndDateText = new javax.swing.JTextField();
        accoInfoAddButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        studentWindowSubPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 204, 0), new java.awt.Color(51, 153, 0), new java.awt.Color(0, 153, 0), new java.awt.Color(51, 153, 0)));

        personalInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        personalInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        personalInfoLabel.setText("Personal Information");

        personalInfoNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoNameLabel.setText("Name:");

        personalInfoSurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoSurnameLabel.setText("Surname:");

        personalInfoNationalIDLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoNationalIDLabel.setText("TC ID No:");

        personalInfoGenderLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoGenderLabel.setText("Gender:");

        personalInfoPhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoPhoneLabel.setText("Phone:");

        personalInfoMailLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoMailLabel.setText("E-mail:");

        personalInfoBirthdayLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        personalInfoBirthdayLabel.setText("Birthday:");

        personalInfoNationalIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTCidActionPerformed(evt);
            }
        });

        personalInfoDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        personalInfoMounthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        personalInfoYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        personalInfoGenderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout gl_personalInfoPanel = new javax.swing.GroupLayout(personalInfoPanel);
        personalInfoPanel.setLayout(gl_personalInfoPanel);
        gl_personalInfoPanel.setHorizontalGroup(
            gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_personalInfoPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gl_personalInfoPanel.createSequentialGroup()
                        .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(gl_personalInfoPanel.createSequentialGroup()
                                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(personalInfoGenderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(personalInfoNationalIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(personalInfoSurnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personalInfoSurnameText)
                                    .addComponent(personalInfoNationalIDText)
                                    .addGroup(gl_personalInfoPanel.createSequentialGroup()
                                        .addComponent(personalInfoGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 115, Short.MAX_VALUE))))
                            .addGroup(gl_personalInfoPanel.createSequentialGroup()
                                .addComponent(personalInfoNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(personalInfoNameText)))
                        .addGap(61, 61, 61)
                        .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personalInfoPhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(personalInfoMailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personalInfoBirthdayLabel))
                        .addGap(37, 37, 37)
                        .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(personalInfoPhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addGroup(gl_personalInfoPanel.createSequentialGroup()
                                .addComponent(personalInfoDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personalInfoMounthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personalInfoYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(personalInfoMailComboBox))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_personalInfoPanel.setVerticalGroup(
            gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_personalInfoPanel.createSequentialGroup()
                .addContainerGap()
                .addComponent(personalInfoLabel)
                .addGap(11, 11, 11)
                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalInfoNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalInfoPhoneLabel)
                    .addComponent(personalInfoNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalInfoPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalInfoSurnameLabel)
                    .addComponent(personalInfoMailLabel)
                    .addComponent(personalInfoSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalInfoMailComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalInfoNationalIDLabel)
                    .addComponent(personalInfoBirthdayLabel)
                    .addComponent(personalInfoDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalInfoMounthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalInfoYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personalInfoNationalIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(gl_personalInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalInfoGenderLabel)
                    .addComponent(personalInfoGenderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        emergencyContactPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        emergencyContactLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        emergencyContactLabel.setText("Emergency Contact");

        emergencyContactNameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emergencyContactNameLabel.setText("Name:");

        emergencyContactSurnameLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emergencyContactSurnameLabel.setText("Surname:");

        emergencyContactPhoneLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        emergencyContactPhoneLabel.setText("Phone:");

        javax.swing.GroupLayout gl_emergencyContactPanel = new javax.swing.GroupLayout(emergencyContactPanel);
        emergencyContactPanel.setLayout(gl_emergencyContactPanel);
        gl_emergencyContactPanel.setHorizontalGroup(
            gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_emergencyContactPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emergencyContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gl_emergencyContactPanel.createSequentialGroup()
                        .addGroup(gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(emergencyContactPhoneLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emergencyContactSurnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(emergencyContactNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emergencyContactSurnameText)
                            .addComponent(emergencyContactNameText)
                            .addComponent(emergencyContactPhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        gl_emergencyContactPanel.setVerticalGroup(
            gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_emergencyContactPanel.createSequentialGroup()
                .addContainerGap()
                .addComponent(emergencyContactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencyContactNameLabel)
                    .addComponent(emergencyContactNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencyContactSurnameLabel)
                    .addComponent(emergencyContactSurnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gl_emergencyContactPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emergencyContactPhoneLabel)
                    .addComponent(emergencyContactPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        schoolInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        schoolInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        schoolInfoLabel.setText("School Information");

        schoolInfoUniversityLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        schoolInfoUniversityLabel.setText("University:");

        schoolInfoDepartmentLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        schoolInfoDepartmentLabel.setText("Department:");

        schoolInfoGradeLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        schoolInfoGradeLabel.setText("Grade:");

        javax.swing.GroupLayout gl_schoolInfoPanel = new javax.swing.GroupLayout(schoolInfoPanel);
        schoolInfoPanel.setLayout(gl_schoolInfoPanel);
        gl_schoolInfoPanel.setHorizontalGroup(
            gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_schoolInfoPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(schoolInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gl_schoolInfoPanel.createSequentialGroup()
                        .addGroup(gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(schoolInfoGradeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(schoolInfoDepartmentLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(schoolInfoUniversityLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(schoolInfoUniversityText)
                            .addComponent(schoolInfoDepartmentText)
                            .addComponent(schoolInfoGradeText, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_schoolInfoPanel.setVerticalGroup(
            gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_schoolInfoPanel.createSequentialGroup()
                .addContainerGap()
                .addComponent(schoolInfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(schoolInfoUniversityLabel)
                    .addComponent(schoolInfoUniversityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(schoolInfoDepartmentText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schoolInfoDepartmentLabel))
                .addGap(18, 18, 18)
                .addGroup(gl_schoolInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(schoolInfoGradeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(schoolInfoGradeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        accoInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        accoInfoLabel.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        accoInfoLabel.setText("Accomadation Information");

        accoInfoDormLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accoInfoDormLabel.setText("Dorm:");

        accoInfoRoomLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accoInfoRoomLabel.setText("Room:");

        accoInfoDormComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));

        accoInfoRoomComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { ""}));

        accoInfoStartDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accoInfoStartDateLabel.setText("Start Date:");

        accoInfoEndDateLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        accoInfoEndDateLabel.setText("End Date:");

        accoInfoAddButton.setBackground(new java.awt.Color(204, 255, 204));
        accoInfoAddButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        accoInfoAddButton.setText("ADD");

        javax.swing.GroupLayout gl_accoInfoPanel = new javax.swing.GroupLayout(accoInfoPanel);
        accoInfoPanel.setLayout(gl_accoInfoPanel);
        gl_accoInfoPanel.setHorizontalGroup(
            gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_accoInfoPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accoInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gl_accoInfoPanel.createSequentialGroup()
                        .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(accoInfoRoomLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(accoInfoDormLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(accoInfoDormComboBox, 0, 92, Short.MAX_VALUE)
                            .addComponent(accoInfoRoomComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accoInfoStartDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accoInfoEndDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accoInfoStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(gl_accoInfoPanel.createSequentialGroup()
                                .addComponent(accoInfoEndDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(accoInfoAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        gl_accoInfoPanel.setVerticalGroup(
            gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_accoInfoPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gl_accoInfoPanel.createSequentialGroup()
                        .addComponent(accoInfoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accoInfoDormLabel)
                            .addComponent(accoInfoDormComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accoInfoStartDateLabel)
                            .addComponent(accoInfoStartDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(gl_accoInfoPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(accoInfoRoomLabel)
                            .addComponent(accoInfoRoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accoInfoEndDateLabel)
                            .addComponent(accoInfoEndDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_accoInfoPanel.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(accoInfoAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout gl_studentWindowSubPanel = new javax.swing.GroupLayout(studentWindowSubPanel);
        studentWindowSubPanel.setLayout(gl_studentWindowSubPanel);
        gl_studentWindowSubPanel.setHorizontalGroup(
            gl_studentWindowSubPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_studentWindowSubPanel.createSequentialGroup()
                .addContainerGap()
                .addGroup(gl_studentWindowSubPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accoInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personalInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(gl_studentWindowSubPanel.createSequentialGroup()
                        .addComponent(emergencyContactPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(schoolInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        gl_studentWindowSubPanel.setVerticalGroup(
            gl_studentWindowSubPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_studentWindowSubPanel.createSequentialGroup()
                .addComponent(personalInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gl_studentWindowSubPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emergencyContactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(schoolInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accoInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout gl_studentWindowMainPanel = new javax.swing.GroupLayout(studentWindowMainPanel);
        studentWindowMainPanel.setLayout(gl_studentWindowMainPanel);
        gl_studentWindowMainPanel.setHorizontalGroup(
            gl_studentWindowMainPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
            .addGroup(gl_studentWindowMainPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gl_studentWindowMainPanel.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentWindowSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        gl_studentWindowMainPanel.setVerticalGroup(
            gl_studentWindowMainPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
            .addGroup(gl_studentWindowMainPanel.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gl_studentWindowMainPanel.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentWindowSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentWindowMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentWindowMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pTCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pTCidActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox personalInfoGenderComboBox;
    private javax.swing.JLabel personalInfoLabel;
    private javax.swing.JLabel personalInfoPhoneLabel;
    private javax.swing.JLabel personalInfoMailLabel;
    private javax.swing.JLabel personalInfoBirthdayLabel;
    private javax.swing.JLabel emergencyContactNameLabel;
    private javax.swing.JLabel emergencyContactSurnameLabel;
    private javax.swing.JLabel emergencyContactPhoneLabel;
    private javax.swing.JLabel schoolInfoUniversityLabel;
    private javax.swing.JLabel schoolInfoDepartmentLabel;
    private javax.swing.JLabel schoolInfoGradeLabel;
    private javax.swing.JLabel accoInfoDormLabel;
    private javax.swing.JLabel accoInfoRoomLabel;
    private javax.swing.JLabel accoInfoStartDateLabel;
    private javax.swing.JLabel accoInfoEndDateLabel;
    private javax.swing.JLabel emergencyContactLabel;
    private javax.swing.JLabel schoolInfoLabel;
    private javax.swing.JLabel accoInfoLabel;
    private javax.swing.JLabel personalInfoNameLabel;
    private javax.swing.JLabel personalInfoSurnameLabel;
    private javax.swing.JLabel personalInfoNationalIDLabel;
    private javax.swing.JLabel personalInfoGenderLabel;
    private javax.swing.JPanel studentWindowMainPanel;
    private javax.swing.JPanel studentWindowSubPanel;
    private javax.swing.JPanel personalInfoPanel;
    private javax.swing.JPanel emergencyContactPanel;
    private javax.swing.JPanel schoolInfoPanel;
    private javax.swing.JPanel accoInfoPanel;
    private javax.swing.JTextField schoolInfoUniversityText;
    private javax.swing.JTextField schoolInfoDepartmentText;
    private javax.swing.JTextField schoolInfoGradeText;
    private javax.swing.JTextField emergencyContactNameText;
    private javax.swing.JTextField emergencyContactSurnameText;
    private javax.swing.JTextField emergencyContactPhoneText;
    private javax.swing.JComboBox personalInfoDayComboBox;
    private javax.swing.JComboBox accoInfoDormComboBox;
    private javax.swing.JTextField personalInfoMailComboBox;
    private javax.swing.JTextField accoInfoEndDateText;
    private javax.swing.JComboBox personalInfoMounthComboBox;
    private javax.swing.JTextField personalInfoNameText;
    private javax.swing.JTextField personalInfoPhoneText;
    private javax.swing.JComboBox accoInfoRoomComboBox;
    private javax.swing.JButton accoInfoAddButton;
    private javax.swing.JTextField accoInfoStartDateText;
    private javax.swing.JTextField personalInfoSurnameText;
    private javax.swing.JTextField personalInfoNationalIDText;
    private javax.swing.JComboBox personalInfoYearComboBox;
    // End of variables declaration//GEN-END:variables
}