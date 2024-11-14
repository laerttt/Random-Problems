# Data Mining 

---

## Problem 1

In this problem, you are required to apply various clustering techniques on a given dataset `SyntheticQ1.csv`, which is an artificial dataset containing 4 convex clusters. The dataset has two attributes (X and Y) for each instance, delimited by semicolons.

1. **Data Preprocessing**
   - Remove records with missing values (empty or marked with ‘?’).
   - Remove records where X or Y has a negative value.

2. **Clustering and Visualization**
   - **K-means Clustering:** Apply K-means to generate 4 clusters.
   - **Scatter Plot Visualization** of the clusters.
   - **DBSCAN Clustering:** Use ε = 0.5 and minPts = 3 on the dataset.
   - Visualize DBSCAN clusters using a scatter plot.
   - **Single-Linkage Hierarchical Clustering:** Generate 4 partitions and visualize with a scatter plot.
   - **Complete-Linkage Hierarchical Clustering:** Generate 4 partitions and visualize with a scatter plot.
   - **Average-Linkage Hierarchical Clustering:** Generate 4 partitions and visualize with a scatter plot.

3. **Comparison**
   - Briefly compare and explain the outcomes of all clustering techniques.

**Note:** Do not use dimensionality reduction during visualization.

---

## Problem 2

Apply clustering techniques on the `seeds.csv` dataset, containing 4 attributes related to plant seeds: length, width, asymmetry coefficient, and compactness coefficient.

1. **Elbow Method:** Determine the optimal number of clusters.
2. **K-means Clustering:** Use the optimal number of clusters.
3. **Visualization and Heatmap**
   - **Scatter Plot Visualization** with dimensionality reduction.
   - **Heatmap** of the clustering results.
4. **Hierarchical Clustering:** Apply hierarchical clustering with K partitions (found from the elbow method).
5. **Comparison**: Briefly compare K-means and hierarchical clustering outcomes.

---

## Problem 3

Analyze `stones.csv` dataset, which includes height, width, density, compactness, and texture, with class labels (A to F).

1. **Classification Modeling**
   - Split dataset into 60% train and 40% test.
   - **Decision Tree:** Build a model and generate a confusion matrix and classification report.
   - **KNN (K=5):** Build a model and generate a confusion matrix and classification report.
   - **SVM (Polynomial kernel, degree 3):** Build a model and generate a confusion matrix and classification report.

2. **New Entry Classification**
   - Classify a new entry with specified feature values using all models.

---

## Problem 4

Using the `spambase.data` dataset from UCI repository, perform 500 random splits (80% train, 20% test) and apply the following classification techniques:

- Decision Trees
- KNN
- Support Vector Machines
- Logistic Regression
- Naïve Bayes

Generate a summary table showing average precision, recall, F1 score, and accuracy across the 500 splits.

---

## Problem 5

Select a benchmark dataset, partition it into train and test sets, and apply classification techniques. For each classification technique, plot the variations in accuracy, precision, recall, and F1 score for different train/test ratios.

**Dataset Source:** [UCI Repository](https://archive.ics.uci.edu/ml/datasets/spambase)