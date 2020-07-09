package me.flotsam.frettler;

import java.util.List;
import me.flotsam.frettler.engine.Chord;
import me.flotsam.frettler.engine.Note;
import me.flotsam.frettler.engine.Scale;
import me.flotsam.frettler.engine.ScalePattern;
import me.flotsam.frettler.instrument.Guitar;
import me.flotsam.frettler.view.console.ChordView;
import me.flotsam.frettler.view.console.GuitarView;
import static java.lang.System.out;

public class Main {


  // private final Logger LOGGER = LoggerFactory.getLogger(Main.class);



  public static void main(String[] args) throws Exception {
    Main main = new Main();
    Note[] strings = new Note[] {Note.E, Note.A, Note.D, Note.G, Note.B, Note.E};
    Guitar guitar = new Guitar(strings);
    main.cMajorScale(guitar);

  }

  public void cMajorScale(Guitar guitar) throws Exception {
    GuitarView guitarView = new GuitarView(guitar);
    ChordView chordView = new ChordView(guitar);

    Scale cMajorScale = new Scale(ScalePattern.MAJOR, Note.C);
    out.println(cMajorScale);
    out.println();
    out.println();

    guitarView.showFretboard();
    out.println();
    out.println();

    Chord dMajorChord = new Chord(Note.D, ScalePattern.MAJOR_TRIAD);
    chordView.showChord(dMajorChord);

    guitarView.showFretboard(cMajorScale);
    out.println();


    List<Chord> chords = cMajorScale.createScaleChords();

    for (Chord chord : chords) {
      out.println(chord);
    }
    out.println();

    GuitarView.Options gvOptions = guitarView.new Options(true, false);
    for (Chord chord : chords) {
      out.println();
      guitarView.showFretboard(chord);
      guitarView.showFretboard(chord, gvOptions);
    }

  }

}
