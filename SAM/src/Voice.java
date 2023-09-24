import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.util.Locale;

public class Voice {
    public void voiceBox(String outputResponse) {
        try {

            // Set the property for the voice directory
            System.setProperty ("freetts.voices", "com.sun.speech.freetts.en.us" + ".cmu_us_kal.KevinVoiceDirectory");

            // Register the speech engine
            Central.registerEngineCentral ("com.sun.speech.freetts" + ".jsapi.FreeTTSEngineCentral");

            // Create a synthesizer with the US locale
            Synthesizer synthesizer = Central.createSynthesizer (new SynthesizerModeDesc (Locale.US));

            // Allocate and resume the synthesizer
            synthesizer.allocate ();
            synthesizer.resume ();

            // Set the pitch to 150
            synthesizer.getSynthesizerProperties().setPitch(80.0f);
            // Set the rate to 120
            synthesizer.getSynthesizerProperties().setSpeakingRate(150.0f);
            // Set the volume to 0.8
            synthesizer.getSynthesizerProperties().setVolume(1.0f);


            // Speak the text
            synthesizer.speak (outputResponse, null);

            // Wait for the speech to finish
            synthesizer.waitEngineState (Synthesizer.QUEUE_EMPTY);

            // Deallocate the synthesizer

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

