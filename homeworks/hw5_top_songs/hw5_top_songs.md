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

### 1 — Download the data

Go to the Spotify Charts page at
[https://charts.spotify.com/charts/overview/global](https://charts.spotify.com/charts/overview/global).

1. **Log in.** Click the **Log in** button in the top-right corner of the page.
   If you already have a (free) Spotify account, sign in with it. If you don't,
   click **Sign up** to create one — a free account is all you need, you do
   **not** need a paid Premium subscription.
2. **Accept any permission prompts.** The first time you log in to Spotify
   Charts, Spotify may show a screen asking you to agree to share your account
   info with the Charts site. Click **Agree** to continue.
3. **Open the Weekly Top Songs chart.** From the charts homepage, find the
   **Top Songs** section and click **Weekly** (not Daily). Make sure the
   region is set to **Global** at the top of the page. You should now see a
   numbered list of the top 200 songs for the current week.
4. **Download the CSV.** Look for the small **download icon** (a downward
   arrow) to the right of the chart's title. Click it to download the chart
   as a `.csv` file. The file will be named something like
   `regional-global-weekly-YYYY-MM-DD.csv`.
5. **Place the file in your project folder.** Move the downloaded CSV into
   the same folder as your Java files so your program can read it.

> **Heads up:** If the download button is missing or greyed out, double-check
> that you're logged in and that you've accepted the permission prompt. The
> download only works for signed-in users.

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

