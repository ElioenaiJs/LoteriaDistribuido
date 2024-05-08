package view;

import controller.DeckController;
import controller.TableController;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.util.List;
import model.Card;

public class DeckView extends javax.swing.JFrame {

    /**
     * objetos
     */
    private DeckController deckController;
    private List<Card> shuffledCards;
    private int currentIndex = 0; // Nuevo índice para llevar el seguimiento de la carta actual
    private final TableController tableController;
    private TableView tableView1;
    private TableView tableView2;

    /**
     * Creates new form Deck
     */
    public DeckView() {
        deckController = new DeckController();
        tableController = new TableController();
        // Crear instancias de TableView
        tableView1 = new TableView();
        tableView2 = new TableView();
        initComponents();
        initButton();
        initDeck();
        addTables();
    }

    private void addTables() {

        // Establecer un layout para el contenedor de tablas
        tablesContainer.setLayout(new GridLayout(1, 2)); // Por ejemplo, GridLayout de 1 fila y 2 columnas

        // Agregar las instancias de TableView al contenedor
        tablesContainer.add(tableView1);
        tablesContainer.add(tableView2);
    }

    public void initDeck() {
        // Barajar las cartas al inicio del programa
        shuffledCards = (List<Card>) deckController.getShuffledDeck();

        // Mostrar la primera carta
        if (!shuffledCards.isEmpty()) {
            showNextCard();
        }
    }

    private void showNextCard() {
        // Obtener la imagen de la carta actual
        Card card = shuffledCards.get(currentIndex);
        String imagePath = card.getImage();
        // Cargar la imagen
        Image scaledImage = loadImage(imagePath);
        // Establecer la imagen escalada como icono del contenedor
        deckContainer.setIcon(new ImageIcon(scaledImage));
        phrase.setText(card.getPhrase());

    }

    public Image loadImage(String imagePath) {
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image image = icon.getImage();

        // Escalar la imagen
        int width = deckContainer.getWidth();  // Ancho del contenedor
        int height = deckContainer.getHeight(); // Altura del contenedor
        return image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deckContainer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tablesContainer = new javax.swing.JPanel();
        phrase = new javax.swing.JLabel();
        btnNext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deckContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/54 la rana.jpg"))); // NOI18N
        deckContainer.setMaximumSize(new java.awt.Dimension(300, 700));
        deckContainer.setMinimumSize(new java.awt.Dimension(300, 700));
        deckContainer.setPreferredSize(new java.awt.Dimension(300, 700));
        jPanel1.add(deckContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 150, 170));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        tablesContainer.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(tablesContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 630, 450));

        phrase.setForeground(new java.awt.Color(255, 255, 255));
        phrase.setText("frase");
        jPanel1.add(phrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        if (currentIndex < shuffledCards.size() - 1) {
            currentIndex++;
            showNextCard();
        } else {
            // Mostrar un mensaje si se han mostrado todas las cartas
            JOptionPane.showMessageDialog(this, "¡Se han mostrado todas las cartas!");
        }
        
        //comprobaciones con la carta actual
         Card card = shuffledCards.get(currentIndex);
         
        //comprobar si las tablas tiene la carta
        if (tableView1.hasCard(card)) {
            new JOptionPane().showMessageDialog(rootPane, "El jugador 1 tiene la carta");
        }

        if (tableView2.hasCard(card)) {
            new JOptionPane().showMessageDialog(rootPane, "El jugador 2 tiene la carta");
        }

        /**
         * se comprueba si hay un ganador
         *
         */
        if (tableView2.isWinner()) {
            new JOptionPane().showMessageDialog(rootPane, "El jugador 2 ha ganado");
        }

        if (tableView1.isWinner()) {
            new JOptionPane().showMessageDialog(rootPane, "El jugador 1 ha ganado");
        }
    }//GEN-LAST:event_btnNextMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeckView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNext;
    private javax.swing.JLabel deckContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phrase;
    private javax.swing.JPanel tablesContainer;
    // End of variables declaration//GEN-END:variables

    private void initButton() {
         String imagePath = "/resources/images/next.png";
        // Cargar la imagen
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image image = icon.getImage();

        // Escalar la imagen
        int width = deckContainer.getWidth();  // Ancho del contenedor
        int height = deckContainer.getHeight(); // Altura del contenedor
        Image scaledImage = image.getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        // Establecer la imagen escalada como icono del contenedor
        btnNext.setIcon(new ImageIcon(scaledImage));
    }
}
