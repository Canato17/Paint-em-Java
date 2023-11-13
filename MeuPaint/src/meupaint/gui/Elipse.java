/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint.gui;


import java.awt.Graphics2D;


public class Elipse extends FormaGeometrica {
    
    @Override
    public void desenhar(Graphics2D g2d){
        g2d=(Graphics2D) g2d.create();
        
        int XiniD= Xini<= Xfim ? Xini : Xfim;
        int XfimD= Xini<= Xfim ? Xfim : Xini;
        int YiniD= Yini<= Yfim ? Yini : Yfim;
        int YfimD= Yini<= Yfim ? Yfim : Yini;
        
        if(corPreenchimento != null){
            g2d.setColor(corPreenchimento);
            g2d.fillOval(XiniD, YiniD, XfimD - XiniD, YfimD - YiniD);
        }
       if(corContorno !=null){
            g2d.setColor(corContorno);
            g2d.drawOval(XiniD, YiniD, XfimD - XiniD, YfimD - YiniD);
        }
        
        
        g2d.dispose();
    }
}
