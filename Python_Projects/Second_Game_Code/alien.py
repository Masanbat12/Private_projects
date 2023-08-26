import pygame
from pygame.sprite import Sprite


class Alien(Sprite):
    """A class to represent a single alien in the fleet."""

    def __init__(self, ai_game):
        """Initialize the alien and set its starting position."""
        super().__init__()
        self.screen = ai_game.screen
        self.settings = ai_game.settings

        # Loading the alien image and set its rect attribute.
        self.image = pygame.image.load(
            r'C:\Users\masan\OneDrive - Ariel University\מסמכים\תיקיית עבודות\פייטון\project\alien.bmp')
        self.rect = self.image.get_rect()

        # Scale down the image to desired size, e.g., 50x50.
        self.image = pygame.transform.scale(self.image, (20, 20))
        self.rect = self.image.get_rect()

        # Start each new alien near the top left of the screen.
        self.rect.x = self.rect.width
        self.rect.y = self.rect.height

        # Store the alien's exact horizontal position.
        self.x = float(self.rect.x)

    def update(self):
        """Move the alien down."""
        self.rect.y += (self.settings.alien_speed * self.settings.fleet_direction)

    def check_edges(self):
        """Return True if alien is at edge of screen."""
        screen_rect = self.screen.get_rect()
        if self.rect.right >= screen_rect.right or self.rect.left <= 0:
            return True
