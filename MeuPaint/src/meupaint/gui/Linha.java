/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint.gui;

import java.awt.Graphics2D;

/**
 *
 * @author Carlos
 */
public class Linha extends FormaGeometrica  {
       
  
    
    @Override
    public void desenhar(Graphics2D g2d){
        g2d=(Graphics2D) g2d.create();
        
        if(corContorno!=null){
            g2d.setColor(corContorno);
            g2d.drawLine(Xini,Yini,Xfim,Yfim);
        }
        
        g2d.dispose();
    }
    
}
