package br.com.pi.the.icev.ed.projetofinal;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
/**
 * A classe TrilhaSonora é responsável pela reprodução e interrupção da música do jogo.
 *
 *  @author Luis Eduardo
 *  @author Gabriel Gentil
 *  @author Sarah Ocy
 *  @author Alan Carneiro
 */
public class TrilhaSonora {
    private Clip clip;

    /**
     * Inicia a reprodução da música a partir do arquivo especificado.
     *
     * @param filePath O caminho do arquivo de áudio a ser reproduzido.
     */
    public void reproduzirMusica(String filePath) {
        try {
            // Carrega o arquivo de áudio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filePath));

            // Cria um objeto Clip
            clip = AudioSystem.getClip();

            // Abre o fluxo de áudio e carrega os dados no Clip
            clip.open(audioInputStream);

            // Inicia a reprodução da música
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    /**
     * Interrompe a reprodução da música, caso esteja em andamento, e libera os recursos do Clip.
     */
    public void pararMusica() {
        if (clip != null && clip.isRunning()) {
            // Interrompe a reprodução da música
            clip.stop();
            // Libera os recursos do Clip
            clip.close();
        }
    }
}
