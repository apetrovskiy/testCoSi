// <copyright file="LargestNumberSolution.cs" company="PlaceholderCompany">
// Copyright (c) PlaceholderCompany. All rights reserved.
// </copyright>

namespace Training.Core.LargestNumber
{
    using System;

    public class LargestNumberSolution
    {
        public int LargestNumber(int n)
        {
            var result = 9;
            for (var i = 1; i < n; i++)
            {
                result += 9 * Convert.ToInt32(Math.Pow(10.0, Convert.ToDouble(i)));
            }

            return result;
        }
    }
}
