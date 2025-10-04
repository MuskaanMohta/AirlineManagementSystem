{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "mount_file_id": "18OJPfzThumno6YRrVKDfepzcAjFqf7vd",
      "authorship_tag": "ABX9TyPrrotcxMhNygmXkjrldAr1",
      "include_colab_link": true
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "markdown",
      "metadata": {
        "id": "view-in-github",
        "colab_type": "text"
      },
      "source": [
        "<a href=\"https://colab.research.google.com/github/MuskaanMohta/AirlineManagementSystem/blob/main/NumPy.py\" target=\"_parent\"><img src=\"https://colab.research.google.com/assets/colab-badge.svg\" alt=\"Open In Colab\"/></a>"
      ]
    },
    {
      "cell_type": "code",
      "execution_count": 1,
      "metadata": {
        "id": "hLjNfbfUU58K"
      },
      "outputs": [],
      "source": [
        "import numpy as np"
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "List vs Numpy - Time Taken\n"
      ],
      "metadata": {
        "id": "VvowfHl4YPvW"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "from time import process_time"
      ],
      "metadata": {
        "id": "EnX0aigdXuuz"
      },
      "execution_count": 2,
      "outputs": []
    },
    {
      "cell_type": "markdown",
      "source": [
        "Time taken by a List"
      ],
      "metadata": {
        "id": "7zLrfUqIYsA2"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "python_list=[i for i in range(10000)]\n",
        "start_time=process_time()\n",
        "python_list=[i+5 for i in python_list]\n",
        "end_time=process_time()\n",
        "print(end_time-start_time)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "BK_mpH8SYrKl",
        "outputId": "02c710a4-8ea8-47cd-c2f3-c2a3ec457381"
      },
      "execution_count": 4,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "0.0005985840000004572\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "np_array=np.array([i for i in range(10000)])\n",
        "start_time=process_time()\n",
        "np_array+=5\n",
        "end_time=process_time()\n",
        "print(end_time-start_time)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "P8rjd5hTzrJ8",
        "outputId": "afa9be46-f464-403d-c8a6-379cd2ec43e1"
      },
      "execution_count": 5,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "0.00042462599999915085\n"
          ]
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "Numpy Arrays\n"
      ],
      "metadata": {
        "id": "Ui7veEFz1tjs"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "#list\n",
        "list1=[1,2,3,4,6]\n",
        "print(list1)\n",
        "print(type(list1))\n",
        "\n",
        "#Numpy Array\n",
        "numpy_array=np.array([1,2,3,4,5,6])\n",
        "print(numpy_array)\n",
        "print(type(numpy_array))"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "gVITsKXc0vtL",
        "outputId": "649b42a1-8b44-4869-c40b-8c26b31f7c73"
      },
      "execution_count": 9,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[1, 2, 3, 4, 6]\n",
            "<class 'list'>\n",
            "[1 2 3 4 5 6]\n",
            "<class 'numpy.ndarray'>\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Creating 1D Array\n",
        "a=np.array([1,2,3,4])\n",
        "print(a)\n",
        "a.shape"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "gO5H4n_g2EEd",
        "outputId": "540ef9ae-da12-4445-8c28-21a530622909"
      },
      "execution_count": 11,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[1 2 3 4]\n"
          ]
        },
        {
          "output_type": "execute_result",
          "data": {
            "text/plain": [
              "(4,)"
            ]
          },
          "metadata": {},
          "execution_count": 11
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Creating 2D Array\n",
        "b=np.array([(1,2,3,4),(5,6,7,8)])\n",
        "print(b)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "3rVez0si3VyA",
        "outputId": "c7582ec6-6349-4c0b-dd72-4ac2a2b98156"
      },
      "execution_count": 12,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[1 2 3 4]\n",
            " [5 6 7 8]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "b.shape"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "hsXo9nw_3svQ",
        "outputId": "e90386e4-9bd4-4252-9e37-0965128b1cde"
      },
      "execution_count": 13,
      "outputs": [
        {
          "output_type": "execute_result",
          "data": {
            "text/plain": [
              "(2, 4)"
            ]
          },
          "metadata": {},
          "execution_count": 13
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "type(b)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "arTMBNcj3xDa",
        "outputId": "8579a8d6-7d8d-4864-9fbd-df5bc78749a2"
      },
      "execution_count": 14,
      "outputs": [
        {
          "output_type": "execute_result",
          "data": {
            "text/plain": [
              "numpy.ndarray"
            ]
          },
          "metadata": {},
          "execution_count": 14
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "c=np.array([(1,2,3,4),(5,6,7,8)],dtype=float)\n",
        "print(c)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "zI6FjZOe5Q5T",
        "outputId": "b112d38b-3d78-4156-8e1d-5ca3374df831"
      },
      "execution_count": 22,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[1. 2. 3. 4.]\n",
            " [5. 6. 7. 8.]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "Initial Placeholders in Numpy Array"
      ],
      "metadata": {
        "id": "DA98bmir6w2-"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "#Create a numpy array of zeros\n",
        "d=np.zeros((4,5))\n",
        "print(d)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "MXulDkK65mLw",
        "outputId": "1b4d9a89-5f21-4766-da27-bc9513e21c94"
      },
      "execution_count": 23,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[0. 0. 0. 0. 0.]\n",
            " [0. 0. 0. 0. 0.]\n",
            " [0. 0. 0. 0. 0.]\n",
            " [0. 0. 0. 0. 0.]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Create numpy array of ones\n",
        "e=np.ones((3,3))\n",
        "print(e)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "KDe2oWfX6eG9",
        "outputId": "1879a487-28ca-4622-a014-0ba19c52cc49"
      },
      "execution_count": 24,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[1. 1. 1.]\n",
            " [1. 1. 1.]\n",
            " [1. 1. 1.]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Create numpy array of particular values\n",
        "f=np.full((5,4),8)\n",
        "print(f)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "jVFbYVh27SlL",
        "outputId": "412c0b84-4e4f-4ec6-8000-d176d42df548"
      },
      "execution_count": 25,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[8 8 8 8]\n",
            " [8 8 8 8]\n",
            " [8 8 8 8]\n",
            " [8 8 8 8]\n",
            " [8 8 8 8]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Create an Identity Matrix\n",
        "g=np.eye(5)\n",
        "print(g)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "5fMjJQ4A8Krj",
        "outputId": "db8bedea-f2c4-4b22-ed63-19236b148f9d"
      },
      "execution_count": 34,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[1. 0. 0. 0. 0.]\n",
            " [0. 1. 0. 0. 0.]\n",
            " [0. 0. 1. 0. 0.]\n",
            " [0. 0. 0. 1. 0.]\n",
            " [0. 0. 0. 0. 1.]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Create a numpy array with random values\n",
        "h=np.random.random((3,4))\n",
        "print(h)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "b0Twr5IM9AgH",
        "outputId": "c86acd74-e13a-46bf-c4ed-eaabc7f604c3"
      },
      "execution_count": 39,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[0.77813408 0.72992906 0.95664687 0.84395882]\n",
            " [0.41282653 0.78462838 0.06660918 0.08305453]\n",
            " [0.61376084 0.48754493 0.79352836 0.83350763]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Create random integer values array within a specific range\n",
        "i=np.random.randint(10,100,(3,5))\n",
        "print(i)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "tOtwS6Ju9hVs",
        "outputId": "2f6eae05-f8cc-402f-f3bb-eb017fed2dc7"
      },
      "execution_count": 43,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[32 66 31 57 86]\n",
            " [12 84 41 35 97]\n",
            " [78 93 44 45 79]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Create array of evenly spaced values----->specifying the no of values required\n",
        "j=np.linspace(10,20,5)\n",
        "print(j)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "O0uS2q5M-XhZ",
        "outputId": "ee2e0855-0aad-4986-e9a4-533ff6f073fb"
      },
      "execution_count": 51,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[10.  12.5 15.  17.5 20. ]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "k=np.arange(10,20,2)\n",
        "print(k)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "U_e0SiFJ_SQK",
        "outputId": "966d0532-8f7f-4832-bb7c-03973959767e"
      },
      "execution_count": 55,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[10 12 14 16 18]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Convert a list to a numpy array\n",
        "list2=[10,20,30,40,50,10]\n",
        "np_arr=np.asarray(list2)\n",
        "print(np_arr)\n",
        "type(np_arr)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "X8wnvy3tAGPN",
        "outputId": "a7913979-d1d5-4ef7-c976-6535dddf8163"
      },
      "execution_count": 56,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[10 20 30 40 50 10]\n"
          ]
        },
        {
          "output_type": "execute_result",
          "data": {
            "text/plain": [
              "numpy.ndarray"
            ]
          },
          "metadata": {},
          "execution_count": 56
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Convert a tuple to a numpy array\n",
        "tuple2=(10,20,20,40,50,10)\n",
        "print(type(tuple2))\n",
        "np_arr1=np.asarray(tuple2)\n",
        "print(np_arr1)\n",
        "type(np_arr1)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "pgHdlC1aBO4w",
        "outputId": "0fa30cde-a545-4e15-ba36-2ab3a7983395"
      },
      "execution_count": 59,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "<class 'tuple'>\n",
            "[10 20 20 40 50 10]\n"
          ]
        },
        {
          "output_type": "execute_result",
          "data": {
            "text/plain": [
              "numpy.ndarray"
            ]
          },
          "metadata": {},
          "execution_count": 59
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Analysis of a numpy array\n",
        "l=np.random.randint(10,90,(5,4))\n",
        "print(l)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "PXeU-8K1BdY0",
        "outputId": "08f230b4-6c42-4d12-b7d2-125626e8357c"
      },
      "execution_count": 64,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[39 45 61 68]\n",
            " [61 31 53 36]\n",
            " [30 26 82 28]\n",
            " [57 80 38 54]\n",
            " [40 43 35 66]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Array dimension\n",
        "print(l.shape)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "1dPdGMqZCQdw",
        "outputId": "2a8e89b3-a3f8-4a96-fea6-f8f3f02e2832"
      },
      "execution_count": 65,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "(5, 4)\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#No of dimension in array\n",
        "print(l.ndim)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "5QdaFpqICSX6",
        "outputId": "ec9ef6a9-8e0a-4860-eb57-a13c1f73c678"
      },
      "execution_count": 66,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "2\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#No of elements in array\n",
        "print(l.size)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "Ig6wFwKRCUs_",
        "outputId": "723065a8-63b2-49e2-8982-a79c8fd3c60f"
      },
      "execution_count": 67,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "20\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#checking the data type of values in the array\n",
        "print(l.dtype)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "Y8RwaDqYCjAr",
        "outputId": "b9e1091f-018e-4230-c084-dcba7121b222"
      },
      "execution_count": 68,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "int64\n"
          ]
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "Mathematical Operations on Numpy Array"
      ],
      "metadata": {
        "id": "LuqTnP6TDXNq"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "list3=[1,2,3,4,5]\n",
        "list4=[6,7,8,9,10]\n",
        "print(list3+list4)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "pdG8y4UkCyA-",
        "outputId": "2624c679-1cca-4a98-b123-d6e99e2af40b"
      },
      "execution_count": 69,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "a1=np.random.randint(0,10,(3,3))\n",
        "b1=np.random.randint(10,20,(3,3))"
      ],
      "metadata": {
        "id": "1b8xvuvjDk4H"
      },
      "execution_count": 81,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "print(a1)\n",
        "print(b1)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "sIWL_UNmEsqR",
        "outputId": "00258a8e-2ec3-42b4-9f65-2ffc85d999bb"
      },
      "execution_count": 82,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[7 7 8]\n",
            " [6 9 5]\n",
            " [5 6 0]]\n",
            "[[14 14 13]\n",
            " [18 14 17]\n",
            " [13 14 10]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "print(a1+b1)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "_0pPgDmTEu_C",
        "outputId": "4f87038f-db18-4702-b7df-95d03ca6abd0"
      },
      "execution_count": 83,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[21 21 21]\n",
            " [24 23 22]\n",
            " [18 20 10]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "print(a1-b1)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "k2RSiUfGEyX4",
        "outputId": "b7dd0177-7099-493a-d38b-ee872a355c2f"
      },
      "execution_count": 84,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[ -7  -7  -5]\n",
            " [-12  -5 -12]\n",
            " [ -8  -8 -10]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "print(a1*b1)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "SKcFZLAmE7_s",
        "outputId": "1538baa0-5cff-4d8a-c5df-99dbc3e253da"
      },
      "execution_count": 85,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[ 98  98 104]\n",
            " [108 126  85]\n",
            " [ 65  84   0]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "print(a1/b1)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "dketVAw1FBqM",
        "outputId": "a9724e2e-b303-432a-82b8-7db14f130338"
      },
      "execution_count": 86,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[0.5        0.5        0.61538462]\n",
            " [0.33333333 0.64285714 0.29411765]\n",
            " [0.38461538 0.42857143 0.        ]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "a2=np.random.randint(0,10,(3,3))\n",
        "b2=np.random.randint(10,20,(3,3))"
      ],
      "metadata": {
        "id": "VKZkM2NRFEPO"
      },
      "execution_count": 87,
      "outputs": []
    },
    {
      "cell_type": "code",
      "source": [
        "print(a2)\n",
        "print(b2)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "hrF0FSBwFN9R",
        "outputId": "de1441d5-8535-47ed-b8f2-91a04ed6f522"
      },
      "execution_count": 88,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[2 3 4]\n",
            " [8 2 6]\n",
            " [9 0 4]]\n",
            "[[12 17 13]\n",
            " [17 19 13]\n",
            " [13 16 11]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "print(np.add(a2,b2))\n",
        "print(np.subtract(a2,b2))\n",
        "print(np.multiply(a2,b2))\n",
        "print(np.divide(a2,b2))"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "DwGEFuvzFi3c",
        "outputId": "b83ef5e2-f914-46bc-c409-120dbc4ff347"
      },
      "execution_count": 89,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[14 20 17]\n",
            " [25 21 19]\n",
            " [22 16 15]]\n",
            "[[-10 -14  -9]\n",
            " [ -9 -17  -7]\n",
            " [ -4 -16  -7]]\n",
            "[[ 24  51  52]\n",
            " [136  38  78]\n",
            " [117   0  44]]\n",
            "[[0.16666667 0.17647059 0.30769231]\n",
            " [0.47058824 0.10526316 0.46153846]\n",
            " [0.69230769 0.         0.36363636]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "markdown",
      "source": [
        "Array Manipulation"
      ],
      "metadata": {
        "id": "3iCVRGlfHcrJ"
      }
    },
    {
      "cell_type": "code",
      "source": [
        "array=np.random.randint(0,10,(2,3))\n",
        "print(array)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "8ial7ZbvFvB-",
        "outputId": "cba141cc-6ec8-4681-985f-3dc3227acc9a"
      },
      "execution_count": 90,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[0 5 8]\n",
            " [0 5 7]]\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Transpose of array----->Method 1\n",
        "trans=np.transpose(array)\n",
        "print(trans)\n",
        "print(trans.shape)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "Cd5IhxJXG2ai",
        "outputId": "eab56cbf-1436-4737-94c3-3a839820b10a"
      },
      "execution_count": 91,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[0 0]\n",
            " [5 5]\n",
            " [8 7]]\n",
            "(3, 2)\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Transpose of array---->Method 2\n",
        "trans2=array.T\n",
        "print(trans2)\n",
        "print(trans2.shape)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "SufeLT4wHCYe",
        "outputId": "b1ff3891-ee67-4462-b05c-e44cf1c6bdf7"
      },
      "execution_count": 92,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[0 0]\n",
            " [5 5]\n",
            " [8 7]]\n",
            "(3, 2)\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#Reshaping of an array\n",
        "array1=np.random.randint(0,10,(2,3))\n",
        "print(array1)\n",
        "print(array1.shape)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "0DpZF1JAHNT9",
        "outputId": "8cdce547-225e-472b-ec7f-40e2eda04e37"
      },
      "execution_count": 93,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[8 9 1]\n",
            " [7 6 6]]\n",
            "(2, 3)\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "array2=array1.reshape(3,2)\n",
        "print(array2)\n",
        "print(array2.shape)"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "lMGZjOtVIJF4",
        "outputId": "b2a42038-f19e-43df-fd05-f80f9d7032e5"
      },
      "execution_count": 99,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "[[8 9]\n",
            " [1 7]\n",
            " [6 6]]\n",
            "(3, 2)\n"
          ]
        }
      ]
    },
    {
      "cell_type": "code",
      "source": [],
      "metadata": {
        "id": "rCyzRGBcITQh"
      },
      "execution_count": null,
      "outputs": []
    }
  ]
}