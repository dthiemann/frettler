Both the GuitarView and the ChordView can display the notes or intervals with unique ANSI colours, if you are
either running from the command line and using an ANSI colour friendly terminal, or in Eclipse using an ANSI Console
plugin (goto to Eclipse Marketplace and search for 'ANSI console').

The colours look good in my Eclipse with Dark mode (what programmer doesn't use Dark Mode?!), and they help to scan the notes and intervals
and easily see the patterns.

The ChordView is more a work in progress. I plan to write code to identify the three/four finger chord positions for any given chord, and get it
to display create standard chord diagrams, as an alternative to display each and every occurence of the chords notes.

The Main class is my scratchpad for creating scales, chords and viewing them with the console views.

The shortened output of running the Main.java example currently, without colour as github markdown doesn't grok it :

```

                          C Chromatic Scale                      

   ┏━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┓
 E┃┃┈┈F┈┈┈┃┈┈F#┈┈┃┈┈G┈┈┈┃┈┈G#┈┈┃┈┈A┈┈┈┃┈┈A#┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈C#┈┈┃┈┈D┈┈┈┃┈┈D#┈┈┃┈┈E┈┈┈┃
 B┃┃┈┈C┈┈┈┃┈┈C#┈┈┃┈┈D┈┈┈┃┈┈D#┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈F#┈┈┃┈┈G┈┈┈┃┈┈G#┈┈┃┈┈A┈┈┈┃┈┈A#┈┈┃┈┈B┈┈┈┃
 G┃┃┈┈G#┈┈┃┈┈A┈┈┈┃┈┈A#┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈C#┈┈┃┈┈D┈┈┈┃┈┈D#┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈F#┈┈┃┈┈G┈┈┈┃
 D┃┃┈┈D#┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈F#┈┈┃┈┈G┈┈┈┃┈┈G#┈┈┃┈┈A┈┈┈┃┈┈A#┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈C#┈┈┃┈┈D┈┈┈┃
 A┃┃┈┈A#┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈C#┈┈┃┈┈D┈┈┈┃┈┈D#┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈F#┈┈┃┈┈G┈┈┈┃┈┈G#┈┈┃┈┈A┈┈┈┃
 E┃┃┈┈F┈┈┈┃┈┈F#┈┈┃┈┈G┈┈┈┃┈┈G#┈┈┃┈┈A┈┈┈┃┈┈A#┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈C#┈┈┃┈┈D┈┈┈┃┈┈D#┈┈┃┈┈E┈┈┈┃
   └━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┛


   D (D Major Triad) [D,F#,A]   

          A   D                 
    -------------------------
 1  |   |   |   |   |   |   | 1  
    -------------------------
    | F#|   |   | A |   | F#|    
    -------------------------
 3  |   |   |   |   | D |   | 3  
    -------------------------
    |   |   | F#|   |   |   |    
    -------------------------
 5  | A | D |   |   |   | A | 5  
    -------------------------
    |   |   |   |   |   |   |    
    -------------------------
 7  |   |   | A | D | F#|   | 7  
    -------------------------
    |   |   |   |   |   |   |    
    -------------------------
 9  |   | F#|   |   |   |   | 9  
    -------------------------
    | D |   |   |   | A | D |    
    -------------------------
    |   |   |   | F#|   |   |    
    -------------------------
 12 |   | A | D |   |   |   | 12 
    -------------------------


                            C Major Scale                        

   ┏━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┓
 E┃┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃
 B┃┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈B┈┈┈┃
 G┃┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃
 D┃┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃
 A┃┃┈┈┈┈┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃
 E┃┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈B┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃
   └━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┛

C [C (P1), E (M3), G (P5)]
Dm [D (P1), F (m3), A (P5)]
Em [E (P1), G (m3), B (P5)]
F [F (P1), A (M3), C (P5)]
G [G (P1), B (M3), D (P5)]
Am [A (P1), C (m3), E (P5)]
Bdim [B (P1), D (m3), F (d5)]


                      C (C Major Triad) [C,E,G]                  

   ┏━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┓
 E┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃
  ┃┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
 G┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
 E┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈G┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈C┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈E┈┈┈┃
   └━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┛
                      C (C Major Triad) [C,E,G]                  

   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
M3┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈M3┈┈┃
  ┃┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈M3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
P5┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈M3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈M3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈M3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
M3┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈M3┈┈┃
   └━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

                     Dm (D Minor Triad) [D,F,A]                  

   ┏━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┓
  ┃┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
 D┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃
 A┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃
  ┃┃┈┈F┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈A┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈D┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
   └━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━.━━━━━━━━━━━━━━━━━━━━.━━━┛
                     Dm (D Minor Triad) [D,F,A]                  

   ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
  ┃┃┈┈m3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈m3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
  ┃┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈m3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
P1┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈m3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃
P5┃┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈m3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃
  ┃┃┈┈m3┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P5┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃┈┈P1┈┈┃┈┈┈┈┈┈┃┈┈┈┈┈┈┃
   └━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛

```

