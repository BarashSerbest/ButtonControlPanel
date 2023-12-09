/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Barash Serbest - 5220505051
// Form kodları proje içerisindeki "frmButonKontrolPaneli.java" form uygulaması içerisinde bulunmakta.  
package com.mycompany.barash_serbest_5220505051;

/**
 *
 * @author const
 */ 
public class Barash_Serbest_5220505051 {

    public static void main(String[] args) {
        // JFrame sınıfından kalıtım alan frmButonKontrolPaneli sınıfndan bir nesne oluşturuluyor ve formun runtime içerisinde açılması için gerekli işlemler yapılıyor. 
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmButonKontrolPaneli().setVisible(true);
            }
        });
    }
}
