package com.example.maze;

public class Maze {
  public String name;
  public int width;
  public int height;
  public int[][] grid;

  public Maze(String name, int width, int height, int[][] grid) {
    this.name = name;
    this.width = width;
    this.height = height;
    this.grid = grid;
  }
}
