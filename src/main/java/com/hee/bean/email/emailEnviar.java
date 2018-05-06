/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hee.bean.email;

import java.io.Serializable;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@ManagedBean(name = "emailEnviar")
@RequestScoped
public class emailEnviar implements Serializable {

    private final Logger logger = Logger.getAnonymousLogger();
    private final String servidorSMTP = "smtp-mail.outlook.com";
    private final int puertoSMTP = 587;
    private String cuentaEnvio = "siap.heee@outlook.com";
    private String contrasenia = "adminsiap123";
    private String to;
    private String subject;
    private String messageContent;
    private Properties configuracion = new Properties();
    private Date fecha;
    
    public emailEnviar() {
        
        fecha=new Date();
        to = "ricardo.mpcs@gmail.com";
        subject = "prueba";
        messageContent = "esto es una prueba de la clase comprobando velocidad al:"+fecha;
    }

    public void enviarCorreo() {
        configuracion.put("mail.smtp.auth", "true");
        configuracion.put("mail.smtp.starttls.enable", "true");
        configuracion.put("mail.smtp.host", servidorSMTP);
        configuracion.put("mail.smtp.port", puertoSMTP);
        final Session session = Session.getInstance(configuracion, new Authenticator() {

            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(cuentaEnvio, contrasenia);
            }

        });

        try {
            final Message message = new MimeMessage(session);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setFrom(new InternetAddress(cuentaEnvio));
            message.setSubject(subject);
            message.setText(messageContent);
            message.setSentDate(new Date());
            Transport.send(message);
        } catch (final MessagingException ex) {
            logger.log(Level.WARNING, "Error al enviar email: " + ex.getMessage(), ex);
        }
        
        System.out.println("paso envio de correo");

    }

    public Properties getEmailProperties() {
        final Properties configuracion = new Properties();
        configuracion.put("mail.smtp.auth", "true");
        configuracion.put("mail.smtp.starttls.enable", "true");
        configuracion.put("mail.smtp.host", servidorSMTP);
        configuracion.put("mail.smtp.port", puertoSMTP);
        return configuracion;
    }

}
