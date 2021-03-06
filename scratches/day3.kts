
val iinput: List<String> = listOf(
"..##.......",
"#...#...#..",
".#....#..#.",
"..#.#...#.#",
".#...##..#.",
"..#.##.....",
".#.#.#....#",
".#........#",
"#.##...#...",
"#...##....#",
".#..#...#.#"
)

val input: List<String> = listOf(
    ".#....#..##.#..####....#.......",
    "......#..#....#....###......#.#",
    "#..#.....#..............##.#.#.",
    "#.#...#....#...#......##..#..#.",
    "...#..#.##..#..#........###.#.#",
    "...#.#..........#.........##...",
    "...#.#....#.#....#..#......#...",
    "..##.#.....#.......#.###..#..##",
    "..#.......#.......#....##......",
    "....##........##.##...#.###.##.",
    "#.......#.......##..#......#...",
    "..##.............##.#......#...",
    "...#.####....#.....#...##......",
    ".............##.#......#.......",
    "..#...#....#......#....#.......",
    "..#....#..#............#.......",
    "##...#..#........##..#......#..",
    "##........##........#.#.......#",
    "#.......#........#.#..#....###.",
    ".....#..#.#..........##...#....",
    "..##...#......#.#...#..#...#...",
    "##.##...#......#....#....#...#.",
    "#.......#..#.#..#....#..###.#.#",
    "#.............#.#....#..#.#....",
    "...#.......###.#.##.##.#...#..#",
    ".##.......##..##...#..###......",
    ".......#.#.#.#..####..#..#..#..",
    "...##......#.#.##.###....#.###.",
    "###......###......#.#####..#...",
    "..#........##..#..##.##..#...#.",
    ".....##..#...#..#.##.....#.#...",
    "#......#.##....#..##.#....#.#..",
    "##.#.##..#................#....",
    "......#.#....#......##.....#...",
    "..#...##..#..#...#..#.#..#.....",
    "........#.#.#.##...#.#.....#.#.",
    "#.#......#.....##..#...#.......",
    "..#.#......#...........###.....",
    "......##....#....##..#..#.#.#.#",
    "##....#.###...#......#..#...#..",
    "#.#.##....###...####.......#..#",
    "##...........#.....#........#.#",
    ".##.#..#.....#......#.......#..",
    "##..##..###....#.........##....",
    "..#..#..#.##...#.#...#........#",
    "#.##.###...#.......#...........",
    ".........#.................#...",
    "#.##...#.....#..##........#....",
    "....#.#...##...#...........#...",
    ".#.....#.#..#...##..##.....#...",
    ".#.....####....#..##..#........",
    "...#..#......##.#..##.#.#.#..#.",
    ".##.#.....#.....#...#.......##.",
    "......#..#..#......#...####....",
    ".......#......##..#..##.....#..",
    "......#.#..#...#..#.#..........",
    "....##.........#...............",
    ".#....#..##.....#....##.##.....",
    "#.#.....#...#....####....#.#...",
    "#.....#....#.#...#.............",
    "...#..#.....#....##..#..#......",
    "...#.#............#...........#",
    "###.#..#.#......#.....##.....#.",
    "####....#....###.....#..#.#####",
    ".###..#...#.#..#......##.#.#.#.",
    ".....#.##.#....#..##....#..#..#",
    "...#....#...##.....#......#.#..",
    "....#...#....#...#....#.....#.#",
    ".#.....#.....#.#..#......#..#..",
    "..#..##....##.##....#.....##...",
    "#..##...#.##...#..#.#.#.....#..",
    "...#..##.#..#....#.#....######.",
    "..........#..#.....#....#...##.",
    "#.#####.#.###..#.....#.........",
    "#....#......#..#.#.##.##..###..",
    "..#...###.#.#....##.##...##....",
    ".......#....#..#...##......#...",
    "...#.#...#..#.....#..##.#......",
    "###..##...........#............",
    "..#....#.##....#.#..##...#.....",
    "##....#...#....#.....#.#..##...",
    "..............#.##.#..#..##.###",
    "......#..#..#..#.#....###...##.",
    ".#...#..#.#.#....#..........#..",
    "..#.#.....#..#...........#.##..",
    "...#.#......#......#..#..#.#...",
    "...#....#.#.#.....#...#.##..#..",
    ".#.#..#...#........##.......#..",
    "##..........#..#...#....###.#..",
    "#.....###......#..#.#.#....#.#.",
    "..###.......#.#...............#",
    "#....#.....#.#......#..##.##...",
    "#.##.#.#....#..#.#...#.#...#..#",
    "#....#..#...........#.......#..",
    "...#.####.....#.........###.##.",
    "......#..#.....#..........#..#.",
    "#...#.#..####...#...#.#.##...##",
    ".##.........#......#.#.#.......",
    ".......##...##.##....###...##..",
    "...#..#....#..#.#.#.....#.#....",
    "#....#.#.#.......##..###..##...",
    "......#............#.#...#..#..",
    "#.#.....#......#...#.......###.",
    "...#.#................#...#....",
    ".....#......#.#..#...##.#.#...#",
    "#....#.#..#..#..##..#.##..#....",
    "#.................#..#....#....",
    "..#....#.......####....###.....",
    ".#..#.#.#...###..#...#..###....",
    "..#..#.#......#.###..........#.",
    ".....#......#.......##....##.#.",
    ".#....#........#.#.##.#........",
    "#.#..##..#..#.#...####....##...",
    "...#....#.#..#...#..........#..",
    ".#.....#.##....#...##..........",
    "....##....#.....#.....#...#.###",
    ".#...##.#.#..##..#...#.#..#..#.",
    "..#.......#.##.....#.#........#",
    "...#...#.....##..#.#.#....#....",
    "...#.....#.......##.........#.#",
    ".##.....#..#.#...#.#...#.#...#.",
    "...........#...#.###..#...#..#.",
    "#.##........#..###.##...####...",
    ".#.....#.#...##...#..#..#...##.",
    "..#....#..#...#.....#.....##...",
    "..###..#.#.....##........#.##..",
    ".#.#..##........#.##....#..#.##",
    ".####.#..##..#.#..#....##....#.",
    ".##....##...#.#........#.......",
    "....#..#..#...#..#..#..#.#.....",
    "...#......................#....",
    "#.....#.#....#..#..#.#..#....#.",
    "##.....#.....##..........###...",
    ".#..#..............#...##.#.#.#",
    "...#...#.#.............#.#..#.#",
    "..#.....#.......#......#.#.....",
    ".###.#..#..#..#.#..#.....#.....",
    ".....##..##...##.......#....###",
    ".#........###...##..#....##....",
    "#....#.#......##..#....#.##..#.",
    "#....#.#...#........##...###...",
    ".#.....#...#.###....#.##.#.####",
    "###......#....#...#....##..#..#",
    "##....#..###......#...#.#.#....",
    "..........#......##.#..#.......",
    ".#..#......###.........##...#..",
    "....#......#....#.........#.#.#",
    "##.#.#...#.#...#...#..#......#.",
    "....#.##.........#..#.....##.#.",
    "........#...#..#.#.#.#.....##..",
    "..#......#.#.#..#.....##.......",
    "..............#....#....##.#..#",
    "....#.#.....#....#.#.###.#....#",
    "..#..........#..#......#.##..#.",
    "...#...#.#.............#..#....",
    "#.......#..#..##.........##..#.",
    "..##..#............#.....#.....",
    "....#.#..##...#.#..#.........#.",
    "........#.......#.##....#....#.",
    "...#.....#.#.....#.#....#......",
    "..#......##.#.............#.#.#",
    "#.#.............#.#.....#......",
    ".##....##.#.....#....#...##....",
    ".#.#....##....#.....##.........",
    "...#.....#.....#.....#..#.###..",
    ".......#....#...##.#...#...#..#",
    "..#.#.......#...###.#...#....#.",
    ".....###..##....###.#.##.......",
    "....#..................##.#.##.",
    ".#.......###.##...#.#.....#....",
    "....#....##...##.....#.#...#..#",
    "#..#.....#......##...#....#....",
    "#..##.........#.....#...#......",
    "...#..##.......##......#..#####",
    ".#..###.###.#.##........#......",
    ".#...#....#....#.#....#...##...",
    "##........#....#.........##..#.",
    ".#.....##............#.#.......",
    "....#....#...........###.....##",
    ".#......#.#.#..#....#.#.....##.",
    "......#.##.#..##....#.#.#..#...",
    "#....#......#...#..####........",
    "......#..#..##..#.......#.#..#.",
    "##....##.###.#...#.##.#..#.###.",
    ".#.........#...##...#.#......#.",
    "..#.#...........####.#....##.##",
    ".....#.#..##.#...###...#..#.#..",
    "...#..#..##.#...#.....#.##...##",
    "..##......##..........#..###...",
    ".#......##.....#.##....#.#.##.#",
    "...#.......##..##.....#....#...",
    ".##...#...#....#..#............",
    "#..#....#...........#..........",
    "......#...#.#.......#...#.##..#",
    "..#.###..#.....#.....#..#.....#",
    "....#....#..........##....#..#.",
    ".......##.#.#.#......#....#...#",
    "####..#.###........#..#......#.",
    "#........##.#.#.#.............#",
    ".#......#......#..#.##.....#...",
    ".....##.##......##.#.....#.#.#.",
    ".......##.#.....##.......#.#.#.",
    ".#.#..#.#..#.##...#.#....#.#..#",
    ".#..##....#..#...##.......#..#.",
    ".#.#..#.......#................",
    "#........#.#.#......#.#.#.#....",
    "##......#...#..##.#...##.##....",
    "##.#..#...........##...#..###..",
    "......#.####...#........#.#.#..",
    "...#........##..###.#.#...#...#",
    ".#.....##..#......##......###..",
    "..#.#...#......#..#..##.#.....#",
    "#....#..#.#..........#...#.....",
    ".#......#.##..###..#.#....#..##",
    ".......#.......#..#..#......#..",
    "..##.....##.#..#..#.....##.....",
    "........#.##...#.#.#..#..#..#..",
    "...#.######.........#.....#..##",
    ".#.#............#....#.........",
    "#...#....###.#......#.#........",
    "#.........#....#...##..........",
    "....#...........#.###.#...###..",
    ".........#........#.#.#..#...#.",
    ".#.......#.#.....#.#.....#.##..",
    ".....#.......#.....#.#.#.......",
    "#.##..#..##.......#...#......#.",
    ".###.....##...##.#...##.##.#.#.",
    "...#......##..##............#.#",
    "...#......................#..##",
    "#..#..#................#...#...",
    "#..#....#.#.#...##.......#..#..",
    "....#.#..###.##...#..#.###..#..",
    "..#...#....####.#............#.",
    "......#....#.#...#.#.#.........",
    "#...#........#.....##..###.#..#",
    "#....#...#...##...#..#....##...",
    "#..#...#..#.......#.#..##.#..#.",
    "#.#..........#...........##....",
    ".#...###...#......#.......#.#.#",
    ".........#.........#...#...##..",
    "##.#..###......##..#.....#..#..",
    "....##...............#.....#...",
    ".....#.....###.#.....#.#.......",
    "....#..#......###..#..##..#....",
    "......................#.....#..",
    "..#..#...##....##....#........#",
    "..#....#...#...#.......#.....#.",
    "...##.#.#.##......#.#.#.#.####.",
    ".###...#..#......#.#..#........",
    "#..#...##.#..#..##..##....#...#",
    "...#...#..#..#..#........#..##.",
    ".##....#.##.#....#...#.#.#....#",
    "#..#....#..#....#.......##..#.#",
    "...#.#....####...........#...#.",
    "#...#####...#.#..#......#...#.#",
    ".##....#.#.#..#......#..##.....",
    "..........#..#.#.#.....##......",
    ".....#....#..................#.",
    ".........#...#...#....#..###...",
    ".#.#.#....#....................",
    "......##............##.###..#..",
    "#.#...#........####.##..#.#.##.",
    "#........#.#.#.#..#.##.....#...",
    "......####..#.##.......#....#..",
    ".........#...#...#.....#.......",
    "..##.....#...#...#.....##.....#",
    "....#...##....#.....#..#..##.##",
    "..#.........##...##..###..#....",
    "#....#.#.........##.###.#...##.",
    ".##...#....#..#..#.#....##.....",
    "##..#..#..#...........#.##....#",
    "....#..........#...#..#.....#..",
    "........###..#..#.#.#.....##...",
    "#...#...#..###............###..",
    "..#.....#.#.#..#..#.#..#......#",
    "..#...##..#....#...#......#....",
    "#....#........##.....#..##....#",
    "#.....#.#.#..#.......##.#.#.##.",
    "..##...#...#.....#..........#..",
    "##.....#....#......#..........#",
    "......#..#..........#.#..####..",
    "......#...#............##...##.",
    "..#.......##.......#...###.###.",
    ".#..#.#.#...#..##.#......#.#...",
    ".##.....##.#.#...#.##.........#",
    "#.#.######...........#.#####.#.",
    "........#.##...##....##.#.##.#.",
    "....#......#.....#.....###...##",
    "#..............#.#....#.#....#.",
    "....#..###.#.........##.#.#....",
    "..#.#.#..##....####..........#.",
    "...#..#.......#................",
    "...#....#..............#....#..",
    ".....#...#...#....#.#.#..#...#.",
    "......##.............###.##..##",
    ".#...#.#..#......#..#.##.......",
    "##.....#.....#.##...#....#.....",
    "..#..#.#.#.#.#..........#..###.",
    "##..........#........#....#.#..",
    ".....#...#........#.#..###....#",
    ".###.#........#.##......#.#...#",
    "#...##....#....#....##.#.#.....",
    ".....#.#............#..........",
    "..#.##....................#....",
    ".....#..#..#.#..#.##.......#...",
    ".....###......#......##......##",
    "#.....#.#.......##.......#...#.",
    ".#.#...#......#..###...#.....#.",
    "#.#..#...#..##.....#...#.#..#..",
    ".....#.#..........#..#.........",
    ".###..##..##.....#...#...#..##.",
    "#...#.#....#.......##..#.......",
    "###...#.#.#..#.......#......#..",
    "....##........#..........##....",
    "............#....#...........#.",
    "#..#.#....##..#.#..#......##...",
    ".###....##...#....##..........#",
    ".###........#........###.....#.",
    "...#...#.#......#...#....#.....",
    ".###.......#.........#.........",
    "....##.#......#...###......##.#",
    ".###...#..##.....##.......#....",
    ".#.#...#..#.##....#........#..."
    )


var x = 0
var y = 0

var points = emptyList<String>()
var points1 = emptyList<String>()
var points2 = emptyList<String>()
var points3 = emptyList<String>()
var points4 = emptyList<String>()

while(y < input.size-1) {
    if (x+1 > input[0].length-1) x = 0 else x += 1
    y += 1

    points = points.plus(input[y][x].toString())

}

x = 0
y = 0

while(y < input.size-1) {
    if (x+3 > input[0].length-1) x -= input[0].length - 3 else x += 3
    y += 1

    points1 = points1.plus(input[y][x].toString())

}

x = 0
y = 0
while(y < input.size-1) {
    if (x+5 > input[0].length-1) x -= input[0].length - 5 else x += 5
    y += 1

    points2 = points2.plus(input[y][x].toString())

}

x = 0
y = 0
while(y < input.size-1) {
    if (x+7 > input[0].length-1) x -= input[0].length - 7 else x += 7
    y += 1

    points3 = points3.plus(input[y][x].toString())

}

x = 0
y = 0
while(y < input.size-2) {
    if (x+1 > input[0].length-1) x = 0 else x += 1
    y += 2

    points4 = points4.plus(input[y][x].toString())

}

points4

points.filter { it == "#" }.count()
points1.filter { it == "#" }.count()
points2.filter { it == "#" }.count()
points3.filter { it == "#" }.count()
points4.filter { it == "#" }.count()

points.filter { it == "#" }.count().toLong() *
    points1.filter { it == "#" }.count().toLong() *
    points2.filter { it == "#" }.count().toLong() *
    points3.filter { it == "#" }.count().toLong() *
    points4.filter { it == "#" }.count().toLong()

















