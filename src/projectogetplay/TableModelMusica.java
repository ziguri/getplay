
package projectogetplay;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.AbstractTableModel;

/**
 * TableModel, que configura a tabela de Utilizadores que serve de modelo da
 * tabela dos Utilizadores
 *
 * @author Orlando Neves
 * @author Susana Cortez
 * @author Vitor Aires
 */
public class TableModelMusica extends AbstractTableModel {

    private ArrayList<Music> dados;

    /**
     * Empty Contrutor TableModelMusica
     */
    public TableModelMusica() {
        dados = new ArrayList<Music>();

    }

    /**
     * Object Construtor  TableModelMusica
     *
     * @param Arraylist of Music
     */
    public TableModelMusica(ArrayList<Music> d) {
        dados = d;
    }

    @Override
            public String getColumnName(int column) {
                //qual o nome da coluna
                if (column == 0) {
                    return "Name";
                } else if (column == 1) {
                    return "Author" ;
                } else if (column == 2) {
                    return "Album";
                } else if (column == 3) {
                    return "Classification";
                } else if (column == 4) {
                    return "Year";
                }
                return "";
            }
    
    
    
    /**
     * Returns the number of rows of the table
     *
     * @return number of rows
     */
    @Override
    public int getRowCount() {
        return dados.size();
    }

    /**
     * Returns the number of columns of the table
     *
     * @return number of columns
     */
    @Override
    public int getColumnCount() {
        return 5;
    }

    /**
     * Constroi a tabela Linha a Linha.
     *
     * @param rowIndex numero de linhas
     * @param columnIndex numero de colunas
     * @return Name, Author, Album, Classification and year, atributtes of Object Music. 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Music musica = dados.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return musica.getName();
            case 1:
                return musica.getAuthor();
            case 2:
                return musica.getAlbum();
            case 3:
                if (musica.getClassification()==1){
                return "*";
                } else return "";
            case 4:
                return musica.getYear();
            
            default:
                return "Error";
        }

    }
    /**
     * Ordena a tabela por nome (asc)
     */
    public void ordenarPorNome() {
       
        Collections.sort(dados, new Comparator<Music>() {

            @Override
            public int compare(Music musica1, Music musica2) {
                return musica1.getName().compareTo(musica2.getName());
            }
        });
        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }

    
   

}