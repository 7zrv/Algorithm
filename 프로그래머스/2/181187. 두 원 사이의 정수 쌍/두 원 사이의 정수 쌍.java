class Solution {
    public long solution(int r1, int r2) {
        long R1 = r1;
        long R2 = r2;
        long r1sq = R1 * R1;
        long r2sq = R2 * R2;

        long total = 0;

        {
            long x = 0;
            long remMax = r2sq - x * x;
            long yMax = floorSqrt(remMax);
            long remMinVal = r1sq - x * x;
            long yMinAbs = 0;
            if (remMinVal > 0) {
                yMinAbs = ceilSqrt(remMinVal);
            } else {
                yMinAbs = 0;
            }
            if (yMinAbs <= yMax) {
                long cnt;
                if (yMinAbs == 0) {
                    cnt = 2 * yMax + 1;
                } else {
                    cnt = 2 * (yMax - yMinAbs + 1);
                }
                total += cnt;
            }
        }

        for (int xi = 1; xi <= r2; xi++) {
            long x = xi;
            long remMax = r2sq - x * x;
            if (remMax < 0) break; 
            long yMax = floorSqrt(remMax);

            long remMinVal = r1sq - x * x;
            long yMinAbs;
            if (remMinVal > 0) {
                yMinAbs = ceilSqrt(remMinVal);
            } else {
                yMinAbs = 0;
            }

            if (yMinAbs <= yMax) {
                long cntForThisX; 
                if (yMinAbs == 0) {
                    cntForThisX = 2 * yMax + 1;
                } else {
                    cntForThisX = 2 * (yMax - yMinAbs + 1);
                }
                total += 2 * cntForThisX;
            }
        }

        return total;
    }

    private long floorSqrt(long n) {
        if (n < 0) return -1;
        long s = (long) Math.sqrt(n);
        while ((s + 1) * (s + 1) <= n) s++;
        while (s * s > n) s--;
        return s;
    }

    private long ceilSqrt(long n) {
        if (n <= 0) return 0;
        long f = floorSqrt(n);
        if (f * f == n) return f;
        return f + 1;
    }
}
