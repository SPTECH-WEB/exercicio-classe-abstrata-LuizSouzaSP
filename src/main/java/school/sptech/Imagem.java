package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;
    public void adicionar(Figura figura){
        figuras.add(figura);
    }
    public Double calcularSomaDasAreas(){
        Double areaTotal = 0.0;
        for(Figura f:figuras){
            areaTotal += f.calcularArea();
        }
        return areaTotal;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> maioresQue20 = new ArrayList<>();
        for(Figura f:figuras){
            if(f.calcularArea() > 20){
                maioresQue20.add(f);
            }
        }
        return maioresQue20;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();
        for(Figura f:figuras){
            if(f instanceof Quadrado){
                quadrados.add(f);
            }
        }
        return quadrados;
    }
}
