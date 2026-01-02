#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>
#include <math.h>

// ==========================================
// HELPER FUNCTIONS
// ==========================================

// Phase 1 Instruction: Implement the prime check logic here.
bool is_prime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

// Helper Sort Function (For Phase 3)
void helper_sort(int ids[], char strs[][50], int count) {
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            int len1 = strlen(strs[j]);
            int len2 = strlen(strs[j+1]);
            int swap = 0;

            if (len2 > len1) {
                swap = 1;
            } else if (len1 == len2) {
                if (ids[j] > ids[j+1]) {
                    swap = 1;
                }
            }

            if (swap) {
                char temp_str[50];
                strcpy(temp_str, strs[j]);
                strcpy(strs[j], strs[j+1]);
                strcpy(strs[j+1], temp_str);

                int temp_id = ids[j];
                ids[j] = ids[j+1];
                ids[j+1] = temp_id;
            }
        }
    }
    printf("[SYSTEM] Helper Sort Applied.\n");
}

// ==========================================
// PHASE FUNCTIONS
// ==========================================

// Phase 1: Filter Primes -> Store in new buffers
int phase_1_filter(int old_ids[], char old_strs[][50], int count, int new_ids[], char new_strs[][50]) {
    int j = 0;
    for (int i = 0; i < count; i++) {
        if (!is_prime(old_ids[i])) {
            new_ids[j] = old_ids[i];
            strcpy(new_strs[j], old_strs[i]);
            j++;
        }
    }
    return j;
}

// Phase 2: Sanitize Strings -> Remove symbols
void phase_2_sanitize(char strs[][50], int count) {
    for (int i = 0; i < count; i++) {
        int k = 0;
        for (int j = 0; strs[i][j] != '\0'; j++) {
            if (isalnum((unsigned char)strs[i][j])) {
                strs[i][k++] = strs[i][j];
            }
        }
        strs[i][k] = '\0';
    }
}

// Phase 3: Sort
void phase_3_sort(int ids[], char strs[][50], int count) {
    helper_sort(ids, strs, count);
}

// Phase 4: Forge Key -> Extract middle char
void phase_4_forge(char strs[][50], int count, char *raw_key) {
    int k = 0;
    for (int i = 0; i < count; i++) {
        int len = strlen(strs[i]);
        raw_key[k++] = strs[i][len / 2];
    }
    raw_key[k] = '\0';  // FIX: Properly terminate string
}

// ==========================================
// MAIN EXECUTION
// ==========================================
int main() {
    int n = 9;

    int ids[] = {13, 4, 7, 10, 6, 11, 8, 9, 2};
    char strs[][50] = {
        "Chaos@@", "Al%#pha", "Pri!!me", "Gam+ma",
        "Be--ta", "Zeus!!", "Ome--ga", "Del@@ta", "Roo#t"
    };

    int new_ids[20];
    char new_strs[20][50];
    char raw_key[20];

    printf("--- AETHER_OS PROTOCOL STARTED ---\n");

    int valid_count = phase_1_filter(ids, strs, n, new_ids, new_strs);
    printf("Phase 1 Output (%d items).\n", valid_count);

    phase_2_sanitize(new_strs, valid_count);
    printf("Phase 2 Output (Sanitized).\n");

    phase_3_sort(new_ids, new_strs, valid_count);
    printf("Phase 3 Output (Sorted).\n");

    phase_4_forge(new_strs, valid_count, raw_key);
    printf("\nPhase 4 Raw Key: %s\n", raw_key);

    printf("FINAL PASSWORD: %s\n", raw_key);

    return 0;
}
