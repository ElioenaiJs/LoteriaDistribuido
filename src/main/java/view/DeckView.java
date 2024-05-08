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

        tableView1.hasCard(card);
        tableView2.hasCard(card);
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
        cards = new javax.swing.JButton();
        tablesContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deckContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/54 la rana.jpg"))); // NOI18N
        deckContainer.setMaximumSize(new java.awt.Dimension(300, 700));
        deckContainer.setMinimumSize(new java.awt.Dimension(300, 700));
        deckContainer.setPreferredSize(new java.awt.Dimension(300, 700));
        jPanel1.add(deckContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 6, 165, 214));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 95, -1, -1));

        cards.setText("Siguiente");
        cards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardsActionPerformed(evt);
            }
        });
        jPanel1.add(cards, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 18, -1, -1));

        tablesContainer.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(tablesContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 680, 450));

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

    private void cardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardsActionPerformed
        if (currentIndex < shuffledCards.size() - 1) {
            currentIndex++;
            showNextCard();
        } else {
            // Mostrar un mensaje si se han mostrado todas las cartas
            JOptionPane.showMessageDialog(this, "¡Se han mostrado todas las cartas!");
        }
    }//GEN-LAST:event_cardsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeckView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cards;
    private javax.swing.JLabel deckContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel tablesContainer;
    // End of variables declaration//GEN-END:variables
}
