package base.maze;

import base.maze.Maze;

public class Run {
    public static void main(String[] args) {
        Maze maze = new Maze();
        int[][] map = maze.initMiGong(7,8,new int[][]{{3,1},{3,2},{2,5},{2,4},{4,5},{4,6}});
        maze.getOutMaze(map,1,1);
    }
}
