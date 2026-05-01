# CS101 Assignment: Top Songs Analyzer

You are going to build a program that reads real-world data from the
[Spotify Weekly Top Songs Chart](https://charts.spotify.com/charts/overview/global)
and computes interesting metrics about the most-streamed songs on the planet.

## Overview

In this assignment you will write a Java program that:

1. Reads a CSV file downloaded from the Spotify Charts website
2. Stores each column of the data in its own `ArrayList`
3. Computes **three metrics** about the data

The goal of this project is to help you practice:
- Reading files with `Scanner`
- Parsing structured data with `CSVParser`
- Storing data in `ArrayList`s
- Looping over collections of data to compute useful information
- Answering real questions about a dataset with code

---

## Getting Started

### 1 — Get the data

The CSV file is already included in the course repository. You'll find it in the same folder as this assignment:

```
regional-global-weekly-2026-04-30.csv
```

Make sure this file is in the **same folder** as your Java files so your program can read it. If you cloned the CS101 repo, it's already there.

### 2 — Download `CSVParser.java`

You'll need the `CSVParser` helper class, which splits CSV lines correctly
(handling commas inside quoted fields, etc.). Download it into the same
folder as your CSV file:

- [CSVParser.java](https://github.com/icanhazcodeplz/CS101/blob/main/homeworks/hw5_top_songs/CSVParser.java)

### 3 — Create your Java file

Create a new file called `hw5TopSongs.java` in the **same directory** as
`CSVParser.java` and your CSV file. This is where you'll write your program
from scratch.

### 4 — Compile and run

From the terminal, in the folder containing your files:

```bash
javac CSVParser.java hw5TopSongs.java
java hw5TopSongs
```

---

## CSV Columns

Each row in the CSV has the following columns (index starting at 0):

| Index | Column             | Example                        |
|-------|--------------------|--------------------------------|
| 0     | `rank`             | 1                              |
| 1     | `uri`              | spotify:track:7yNf9YjeO5JXUE3… |
| 2     | `artist_names`     | Dominic Fike                   |
| 3     | `track_name`       | Babydoll                       |
| 4     | `source`           | Columbia                       |
| 5     | `peak_rank`        | 1                              |
| 6     | `previous_rank`    | 5                              |
| 7     | `weeks_on_chart`   | 18                             |
| 8     | `streams`          | 35109038                       |

---

## Assignment

### Step 1 — Load the data into `ArrayList`s

Create one `ArrayList` per column and fill them in as you read each line.
For example:

```java
ArrayList<Integer> rank = new ArrayList<Integer>();
ArrayList<String> artistNames = new ArrayList<String>();
// ...etc. for every column you care about
```

Use `CSVParser.splitCSVLine(line)` to split each row, then add each value to
the matching list. After the while-loop finishes, each list should contain one
entry per song.

### Step 2 — Compute three metrics

After loading the data, compute the following three metrics and print each
one:

1. **Longest-running song** — the song with the most `weeks_on_chart`
2. **Biggest jump** — the song whose `rank` improved the most this week
   compared to `previous_rank`
3. **Biggest drop** — the song whose `rank` got worse the most this week
   compared to `previous_rank`

You can use as many `for` loops as you need. It's fine to compute all three
metrics inside a single loop, or to use a separate loop for each — whichever
is clearest to you.

For each metric, print a clear, labeled line that includes the song title,
the artist, and the numeric value. Example output:

```
Song 'Perfect' by 'Ed Sheeran' max weeks on chart at 443
Song 'DAISIES' by 'Justin Bieber' had the biggest jump at 155
Song 'FATHER (feat. Travis Scott)' by 'Kanye West, Ye, Travis Scott' had the biggest drop at 135
```

Your output does not need to match this exactly — just make it easy to read.

---

## Tips

- Columns read from the CSV come in as `String`s. Some columns, ie: `rank`, `previous_rank`, etc, are numerical values.
  How might you convert the string into an integer before storing it?
- For songs that are **new to the chart this week**, `previous_rank` is `-1`.
  Those songs don't have a real "jump" or "drop", so skip them when computing
  those two metrics.
- Test your code on just a few rows first before running on the full file!

---

## Grading (40 points)

| Points | Criteria |
|--------|----------|
| 5 pts  | Program compiles and runs without errors |
| 5 pts  | CSV data is correctly loaded into `ArrayList`s (one per column) |
| 5 pts  | `CSVParser.splitCSVLine()` is used to parse each row |
| 18 pts | All three metrics are computed correctly (6 pts each: correct logic, correct answer, clear printed result) |
| 4 pts  | Output is clear, labeled, and easy to understand |
| 3 pts  | Code is organized and variable names are descriptive |

