package view;

import controller.DeckController;
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

    /**
     * Creates new form Deck
     */
    public DeckView() {
        deckController = new DeckController();
        initComponents();
        initDeck();
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
        String imagePath = shuffledCards.get(currentIndex).getImage();
        // Cargar la imagen
        Image scaledImage = loadImage(imagePath);
        // Establecer la imagen escalada como icono del contenedor
        deckContainer.setIcon(new ImageIcon(scaledImage));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        deckContainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/54 la rana.jpg"))); // NOI18N
        deckContainer.setMaximumSize(new java.awt.Dimension(300, 700));
        deckContainer.setMinimumSize(new java.awt.Dimension(300, 700));
        deckContainer.setPreferredSize(new java.awt.Dimension(300, 700));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cards.setText("Siguiente");
        cards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cards)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(deckContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(deckContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cards))
                .addGap(0, 186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    // End of variables declaration//GEN-END:variables
}
