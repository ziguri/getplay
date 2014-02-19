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
// Duvida: o qu e+por aqui?!
public class TableModelPlaylist extends AbstractTableModel {

    private ArrayList<Playlist> dados;

    /**
     * Empty Contrutor TableModelMusica
     */
    public TableModelPlaylist() {
        dados = new ArrayList<Playlist>();

    }

    /**
     * Object Construtor TableModelMusica
     *
     * @param Arraylist of Music
     */
    public TableModelPlaylist(ArrayList<Playlist> d) {
        dados = d;
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
        return 4;
    }

    /**
     * Constroi a tabela Linha a Linha.
     *
     * @param rowIndex numero de linhas
     * @param columnIndex numero de colunas
     * @return Name, Author, Album, Classification and year, atributtes of
     * Object Music.
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Playlist playlist = dados.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return playlist.getName();
            case 1:
                return playlist.getdateCreationString();
            case 2:
                return playlist.getSize();
            case 3:
               if (playlist.getShared()){
                return Boolean.TRUE;
                } else return Boolean.FALSE;
            default:
                return "Error";
        }

    }
    /**
     * Ordena a tabela por nome (asc)
     */
//    public void ordenarPorNome() {
//       
//        Collections.sort(dados, new Comparator<Music>() {
//
//            @Override
//            public int compare(Music musica1, Music musica2) {
//                return musica1.getName().compareTo(musica2.getName());
//            }
//        });
//        //avisa que a tabela foi alterada
//        fireTableDataChanged();
//    }

}
