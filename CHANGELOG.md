
# 25th Jul 2020
- CLI command structure re-organised - scale|chord was unnecessary
- added some modes for scale display
- completions now generated using lower case params
- --frets option added to allow display of greater than (or less than!) the default 12 frets 
- (code) patterns can be aliased
- (code) patterns can have a parent pattern (used for chord calculation for pentatonic scales)
- pentatonic chords generation fixed
- display of intervals in the vertical view fixed
- demo script added

# 23rd Jul 2020
- lower case param handling

# 23rd Jul 2020
- titles now include instrument details
- more refactoring to correctly name some variables
- BLUES_SCALE added
- VERTICAL handling of SCALE added
- unix/macOS executable shell replaced the simple frettler wrapper shell - built by the build shell. 