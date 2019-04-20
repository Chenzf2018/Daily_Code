# LISTING 6.12 TestRandomCharacter.py

import RandomCharacter

NUMBER_OF_CHARS = 175
CHARS_PER_LINE = 25

for i in range(NUMBER_OF_CHARS):
    print(RandomCharacter.get_random_lower_character(), end=" ")
    if (i + 1) % CHARS_PER_LINE == 0:
        print()
