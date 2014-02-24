/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectogetplay;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aires
 */
public class PnTabelaMusica extends javax.swing.JPanel {

    protected Principal pagPrincipal;

    private DefaultTableModel modelo;
    private ArrayList<Music> dados;
    private int cliqueMusica;
    private Music musicSelecionada;
    private ArrayList<Music> dadosArray;

    public ArrayList<Music> getDados() {
        return dados;
    }

    //
    /**
     * Creates new form PnTabelaMusica
     * @param p
     * @param play
     */
    public PnTabelaMusica(Principal p, ArrayList<Music> play) {
        dados = new ArrayList();
        dadosArray= new ArrayList<>();
        dadosArray.addAll(play); // Adicionei o ArrayList de entrada ao array q vais enviar
        this.pagPrincipal = p;
        atribuiDados(play);
        //criaArray(play);
        cliqueMusica = -1;
        initComponents();
    }
/*
    //criar um array com duas colunas. 1 coluna com o musicCount e outra coluna com o Path da musica
    public void criaArray(){
        if (!dadosArray.isEmpty()) {
            int tamanho = dadosArray.size();
            for (int i = tamanho - 1; i >= 0; i--) {
                dadosArray.remove(i);
            }
        }
        
        
        
        
    int tamanho= tblMusic.getRowCount();
       
        for (int i = 0; i < tamanho; i++) {
            dadosArray.add(new Music(
            (Integer)tblMusic.getValueAt(i, 6),
              (String)tblMusic.getValueAt(i, 0),
               (String)tblMusic.getValueAt(i, 1),
                    (String)tblMusic.getValueAt(i, 2),
                    (Integer)tblMusic.getValueAt(i, 4),
                    (String)tblMusic.getValueAt(i, 7),
                    (String)tblMusic.getValueAt(i, 5)
            ));
   //{music.getName(), music.getAuthor(), music.getAlbum(), fav, music.getYear(), music.getCreatorEmail(), music.getMusicCode(), music.getMusicPath()});
//                dadosArray[i][0]=musica.get(i).getMusicPath();
//                dadosArray[i][1]=musica.get(i).getAuthor();
//                dadosArray[i][1]=musica.get(i).getName();
             // {"Title"0, "Artist"1, "Album"2, "Favorite", "Year"4, "User5", "",""};    
               //public Music(int musicCode6, String aName0, String aAuthor1, String aAlbum2, int aYear4, String aMusicPath7, String aCreatorEmail5)
        }
    }

    public ArrayList<Music> getArray(){
       criaArray() ;
    return dadosArray;
    
    }
    
    */
    
    /**
     * Create a new Arralist dados with Object Music, to be used in the Table
     * Model
     *
     * @param musica ArrayList Music
     */
    public void atribuiDados(ArrayList<Music> musica) {
        dados.clear();
        dados.addAll(musica);
        
        System.out.println(dados);
        System.out.println("aqui atribuiDados() PnTabelaMusica");

    }

    public void novosDados(ArrayList<Music> musica) {
        atribuiDados(musica);
        refresh();
    }

    public void criaModeloTabela() {
        String[] colunas = new String[]{"Title", "Artist", "Album", "Favorite", "Year", "User", "","", ""};
        Object[][] dados = new Object[][]{};
        modelo = new DefaultTableModel(dados, colunas);
    }

    public void carregaTabela() {
        String fav;
        for (Music music : dados) {
            if (music.isFavorite()) {
                fav = "*";
            } else {
                fav = "";
            }

            modelo.addRow(new Object[]{music.getName(), music.getAuthor(), music.getAlbum(), fav, music.getYear(), music.getCreatorEmail(), music.getMusicCode(), music.getMusicPath()});
        }
        modelo.fireTableDataChanged();
    }

    public void removeLinha() {
        modelo.removeRow(tblMusic.getSelectedRow());
        refresh();

    }

    public int tamanhoTabela() {
        return tblMusic.getRowCount();
    }
    
    public int linhaSelecionada() {
        System.out.println("linha seleccionada tabela: "+tblMusic.getSelectedRow());
        return tblMusic.getSelectedRow();
    }

    private int procuraLinha() {
        int num = 0;
        int aux = 0;

        for (int i = 1; i <= tblMusic.getRowCount(); i++) {
            aux = (Integer) tblMusic.getValueAt(i, 6);
            if (aux == cliqueMusica) {
                num = i;
            }
        }
        return num;
    }

    public void adicionaLinha(String name, String artist, String album, int year, String user, String path) {
        int index = pagPrincipal.getApp().musicsList.size();
        int controlo = pagPrincipal.getApp().musicsList.get(index - 1).getMusicCode();

        Object novo[] = {name, artist, album, "", year, user, controlo, path};
        modelo.addRow(novo);
        refresh();

    }

    public void refresh() {
        modelo.fireTableDataChanged();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblMusic = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(830, 420));
        setPreferredSize(new java.awt.Dimension(830, 420));
        setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setMinimumSize(new java.awt.Dimension(830, 420));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(830, 420));

        criaModeloTabela();
        tblMusic.setAutoCreateRowSorter(true);
        tblMusic.setModel(modelo);
        tblMusic.getColumnModel().getColumn(6).setMinWidth(0);
        tblMusic.getColumnModel().getColumn(6).setMaxWidth(0);
        tblMusic.getColumnModel().getColumn(7).setMinWidth(0);
        tblMusic.getColumnModel().getColumn(7).setMaxWidth(0);
        tblMusic.getColumnModel().getColumn(8).setMinWidth(0);
        tblMusic.getColumnModel().getColumn(8).setMaxWidth(0);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        tblMusic.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );

        carregaTabela();
        tblMusic.setRowHeight(30);
        tblMusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMusicMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMusic);

        add(jScrollPane2, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void tblMusicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMusicMouseClicked
        int num = (Integer) tblMusic.getValueAt(tblMusic.getSelectedRow(), 6);
       // JOptionPane.showMessageDialog(null, "Codigo " + num);
        cliqueMusica = num;
        
    }//GEN-LAST:event_tblMusicMouseClicked

    public Music getMusicSelecionada() {
        return musicSelecionada;

    }

    /**
     *
     * @param n linha a que se prentende buscar o valor
     * @return codigo de musica
     */
    public int getValoresLinha(int n) {
        int num;
        num = (Integer) tblMusic.getValueAt(n, 6);
        return num;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMusic;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the cliqueMusica
     */
    public int getCliqueMusica() {
        return cliqueMusica;
    }

    public DefaultTableModel getModelo() {
        return modelo;
    }

    public JTable getTblMusic() {
        return tblMusic;
    }

    public ArrayList<Music> getDadosArray() {
        return dadosArray;
    }
    
    

}
//table.getColumnModel().getColumn(5).setHeaderValue("newHeader");
