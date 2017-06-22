package com.company;
import java.awt.Color;
import java.awt.Graphics;

public class Dasht {
    int x0, y0, n, w;
    MyPanel mp;
    int[][] mas;

    public Dasht(MyPanel mp) {
        this.mp = mp;

        x0 = 50;
        y0 = 50;
        n = 10;
        w = 30;
        mas = new int[n][n];
        // mas[4][7]=1;
    }

    public void paint(Graphics g) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                g.drawRect(x0 + i * w, y0 + j * w, w, w);
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mas[i][j] == 1) {
                    g.setColor(Color.RED);
                    g.fillOval(x0 + i * w, y0 + j * w, w, w);
                }
                if (mas[i][j] == 2) {
                    g.setColor(Color.BLUE);
                    g.fillOval(x0 + i * w, y0 + j * w, w, w);
                }

            }

        }

    }

    public void click(int mx, int my) {
        int i, j;
        i = (mx - x0) / w;
        j = (my - y0) / w;
        if (i >= n || j >= n)
            return;
        if (mas[i][j] != 0) {
            return;

        }
        mas[i][j] = 1;// /user play
        //haxt();

        comp();// Comp play
        //haxt();

        mp.repaint();
    }

    private void comp() {
        //4 hat 2
//4 hat 1
        //3 hat 2
        //3 hat 1
        // 2 hat 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mas[i][j] == 0)
                    if ((i + 2 < n && mas[i + 1][j] == 1 && mas[i + 2][j] == 1)
                            || (j - 2 >= 0 && mas[i][j - 1] == 1 && mas[i][j - 2] == 1)
                            || (i - 2 >= 0 && mas[i - 1][j] == 1 && mas[i - 2][j] == 1)
                            || (j + 2 < n && mas[i][j + 1] == 1 && mas[i][j + 2] == 1)
                            || (i + 2 < n && j - 1 >= 0 && mas[i + 1][j - 1] == 1 && mas[i + 2][j - 2] == 1)
                            || (i + 2 < n && j + 1 < n && mas[i + 1][j + 1] == 1 && mas[i + 2][j + 2] == 1)
                            || (i - 2 >= 0 && j + 1 < n && mas[i - 1][j + 1] == 1 && mas[i - 2][j + 2] == 1)
                            || (i - 2 >= 0 && j - 1 >= 0 && mas[i - 1][j - 1] == 1 && mas[i - 2][j - 2] == 1))

                    {
                        mas[i][j] = 2;
                        return;

                    }
            }
        }
        // 1 hat 0
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mas[i][j] == 0)
                    if ((i + 1 < n && mas[i + 1][j] == 1)
                            || (j - 1 >= 0 && mas[i][j - 1] == 1)
                            || (i - 1 >= 0 && mas[i - 1][j] == 1)
                            || (j + 1 < n && mas[i][j + 1] == 1)
                            || (i + 1 < n && j - 1 >= 0 && mas[i + 1][j - 1] == 1)
                            || (i + 1 < n && j + 1 < n && mas[i + 1][j + 1] == 1)
                            || (i - 1 >= 0 && j + 1 < n && mas[i - 1][j + 1] == 1)
                            || (i - 1 >= 0 && j - 1 >= 0 && mas[i - 1][j - 1] == 1))

                    {
                        mas[i][j] = 2;
                        return;

                    }
            }
        }

    }

}