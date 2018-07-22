# Interview
笔试题目

一队机器人漫游车将被美国宇航局降落在火星高原上。漫游车将在这个奇怪的长方形高原上巡游，以便他们的机载摄像头可以获得周围地形的完整视图，并将其发送回地球。漫游者的坐标和位置由x和y坐标的组合以及代表四个方向（E, S, W, N）的字母表示。高原划分为网格以简化导航。比如位置0，0，N，表示漫游车位于左下角并面向北。为了控制漫游车，美国宇航局发送一串简单的字母。指令字母是'L'，'R'和'M'。 'L'和'R'使漫游车分别向左或向右旋转90度，而不会从当前地点移动。 'M'表示前进一个网格点，并保持相同的方向。
假设从（x，y）直接向北移动，就到了（x，y + 1）。
INPUT：
第一行输入是平台的右上角坐标，左下角坐标被假定为0,0。
其余的输入是有关已部署的漫游车的信息。每个漫游车都有两行输入。第一行给出了漫游车的位置，第二行是告诉漫游车如何探索高原的一系列指令。位置由两个整数和一个由空格分隔的字母组成，对应于x和y坐标以及漫游车当前的方向。
每个漫游车将按顺序完成，这意味着第二个漫游车在第一个漫游车完成移动之前不会开始移动。
OUTPUT：
每个漫游车的输出应该是其最终的坐标和位置。


输入输出例子
输入：
5 5
1 2 N
LMLMLMLMM
3 3 E
MMRMMRMRRM
预期产出：
1 3 N
5 1 E