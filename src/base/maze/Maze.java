package base.maze;

/**
 * 迷宫
 * 走路逻辑，优先度一次往右>下>左>上，允许用户往回走，但是不能重复回走
 * 优化1 选择路线的时候 上下左右 给个基础的减值，墙是999，走向4个位置较小的值，走过一次加1
 * 再次思考最短路径，深度优先、广度优先
 * @author yuxiangfeng
 */
public class Maze {

    /**
     * 计算总步数
     */
    int step = 0;

    int maxStep = 100;

    /**
     * 允许用户往回走，但是不能重复回走
     */
    int backStep = 0;

    /**
     oldGo 代表上一步的位置
     */
    public int[] oldGo = new int[]{-1,-1};

    public void getOutMaze(int[][] map,int x,int y){

        checkMap(map);
        //将要往哪边走
        int X = x;
        int Y = y;
        if (map.length == y + 2 && map[0].length == x + 2 ){
            System.out.println("经过" + step + "步后，走出了迷宫。");
            return;
        }
        //先往右，再往下，再往左，再往上
        if (map[y][x+1] == 0){
            X = x+1;
        }else if (map[y+1][x] == 0){
            Y = y+1;
        }else if (map[y][x-1] == 0){
            X = x-1;
        }else if (map[y-1][x] == 0){
            Y = y-1;
        }else if (step - backStep > 1){
            backStep = step;
            X = oldGo[1];
            Y = oldGo[0];
        }
        else {
            System.out.println("error");
            return;
        }
        go(map,x,y,X,Y);
        getOutMaze(map,X,Y);

    }

    public void go(int [][] map,int x1,int y1 ,int x2,int y2){

        if (step > maxStep){
            throw new RuntimeException("步数超出上线 100 步");
        }
        //初始化上一步
        if (oldGo[0] != -1){
            map[oldGo[0]][oldGo[1]] = 0;
        }
        oldGo[0] = y1;
        oldGo[1] = x1;

        map[y1][x1] = -1;
        map[y2][x2] = 2;

        step++;

        System.out.println("走完一步后的结果====>");
        printMap(map);

    }

    /**
     * 0表示可以走，1表示障碍物，-1表示上一步的位置
     */
    public int[][] initMiGong(int length, int width, int[][] obstacles){
        //初始化地图
        int[][] map = new int[width][length];
        // 初始化围墙
        for (int i = 0;i < width;i++){
            for (int j = 0;j < length;j++){
                if ( i ==0 || i == width - 1 ){
                    map[i][j] = 1;
                }else if(j==0 || j == length - 1) {
                    map[i][j] = 1;
                }
            }
        }
        //初始化障碍物
        for(int i = 0;i < obstacles.length;i++){
            map[obstacles[i][0]][obstacles[i][1]] = 1;
        }

        //输出围墙信息
        System.out.println("初始化结果====>");
        printMap(map);

        return map;
    }

    public void printMap(int[][] map){
        checkMap(map);
        //输出围墙信息
        for(int j = 0;j < map.length;j++){
            for(int k=0;k<map[j].length;k++){
                System.out.print(map[j][k] + " ");
            }
            System.out.println("");
        }
    }

    public void checkMap(int[][] map){
        if (map == null){
            new RuntimeException("map 为空");
        }
    }


}

