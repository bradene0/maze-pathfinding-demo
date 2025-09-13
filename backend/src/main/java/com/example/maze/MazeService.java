package com.example.maze;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class MazeService {
  public List<Maze> getMazes() {
    Maze m1 = new Maze("Small Maze", 5,5, new int[][] { /* grid */ });
    Maze m2 = new Maze("Large Maze", 50,50, new int[][] { /* grid */ });
    return Arrays.asList(m1,m2);
  }
}

