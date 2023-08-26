import pygame
from pygame.sprite import Sprite
from random import randint


class Star(Sprite):
    """A class to represent a single star."""
    def __init__(self, ai_game):
        """Initialize the star and set its starting position."""
        super().__init__()
        self.screen = ai_game.screen

        original_image = pygame.image.load(
            r'C:\Users\masan\OneDrive - Ariel University\מסמכים\תיקיית עבודות\פייטון\project\star.bmp')
        self.image = pygame.transform.scale(original_image, (6, 6))  # Example new size
        self.rect = self.image.get_rect()

        # Start each new star near the top left of the screen.
        self.rect.x = self.rect.width
        self.rect.y = self.rect.height
