/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meupaint.gui;

import java.awt.Graphics2D;
import java.awt.Color;

/**
 *
 * @author Carlos
 */
public abstract class FormaGeometrica {
  
    protected int Xini;
    protected int Yini;
    protected int Xfim;
    protected int Yfim;
    protected Color corContorno;
    protected Color corPreenchimento;
    
    public FormaGeometrica(){
        corContorno= Color.BLACK;
        corPreenchimento=Color.WHITE;
    }
    public abstract void desenhar(Graphics2D g2d);
        

    public int getXini() {
        return Xini;
    }

    public int getYini() {
        return Yini;
    }

    public int getXfim() {
        return Xfim;
    }

    public int getYfim() {
        return Yfim;
    }

    public void setXini(int Xini) {
        this.Xini = Xini;
    }

    public void setYini(int Yini) {
        this.Yini = Yini;
    }

    public void setXfim(int Xfim) {
        this.Xfim = Xfim;
    }

    public void setYfim(int Yfim) {
        this.Yfim = Yfim;
    }

    public Color getCorContorno() {
        return corContorno;
    }

    public void setCorContorno(Color corContorno) {
        this.corContorno = corContorno;
    }

    public Color getCorPreenchimento() {
        return corPreenchimento;
    }

    public void setCorPreenchimento(Color corPreenchimento) {
        this.corPreenchimento = corPreenchimento;
    }
    
}
