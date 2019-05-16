package e.a52311.unidad4_practica1_circulos;

import android.graphics.Canvas;
import android.graphics.Paint;

public class CirculoM {
    int x,y,colorR,colorG,colorB,tamano,desplazamientoX,desplazamientoY;

    public CirculoM(Lienzo lienzo, int posx, int posy){
        x = posx;
        y = posy;
        tamano = (int) (Math.random()*300)+20;//Crea el tamaño del circulo
        colorR = (int) (Math.random()*255)+1;
        colorG = (int) (Math.random()*255)+1;
        colorB = (int) (Math.random()*255)+1;
        if(Math.random()*10<5){//asigna un desplazamineto random si es mañor, es hacia la derecha
            desplazamientoX=10;
        }else{
            desplazamientoX=-10;//izquierda
        }
        if(Math.random()*10<5){//arriba
            desplazamientoY=10;
        }else{
            desplazamientoY=-10;//abajo
        }
    }
    public void mover(int ancho,int alto){
        if(x<=0) desplazamientoX=10;
        if(y<=0) desplazamientoY=10;
        if(x>=ancho) desplazamientoX=(desplazamientoX*-1);
        if(y>=alto) desplazamientoY=(desplazamientoY*-1);
        x+=desplazamientoX;
        y+=desplazamientoY;
    }
    public void dibujar(Canvas c, Paint p) {
        c.drawCircle(x,y,tamano,p);
    }
}
