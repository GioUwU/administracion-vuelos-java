
package Proyecto;

/**
 *
 * @author giogg
 */
public class AreopuertoPrivado extends Areopuerto {
    private String listaEmpresas[] = new String[10];
    private int numEmpresa;

    public AreopuertoPrivado(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AreopuertoPrivado(String nombre, String ciudad, String pais, Compania[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        numEmpresa = e.length;
    }
    
    public void insertarEmpresas(String e[]){
    this.listaEmpresas = e;
    this.numEmpresa = e.length;
    }
    
    public void insertarEmpresa(String e){
    listaEmpresas[numEmpresa] =e;
    numEmpresa++;
    }

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
    
    
}
