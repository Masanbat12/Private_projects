class Settings:
    """A class to store all settings for Alien Invasion."""

    def __init__(self):
        """Initialize the game's static settings."""
        # Screen settings
        self.screen_width = 850
        self.screen_height = 600
        self.bg_color = (80, 80, 240)  # Blue color

        # Ship settings
        self.ship_speed = 2
        self.ship_limit = 3

        # Alien settings
        self.alien_speed = 1.0
        # Setting a default drop speed. This can be adjusted if necessary.
        self.fleet_drop_speed = 20  
        # fleet_direction of 1 represents right; -1 represents left.
        self.fleet_direction = 1

        # Bullet settings
        self.bullet_speed = 2.5
        self.bullet_width = 3
        self.bullet_height = 15
        self.bullet_color = (60, 60, 60)
        self.bullets_allowed = 3

        # Star settings
        self.star_spacing_x = 100  # Space between stars horizontally
        self.star_spacing_y = 100  # Space between stars vertically

        # How quickly the game speeds up
        self.speedup_scale = 1.1
        # How quickly the alien point values increase
        self.score_scale = 1.5
        self.initialize_dynamic_settings()

        # Scoring
        self.alien_points = 50

    def initialize_dynamic_settings(self):
        """Initialize settings that change throughout the game."""
        self.ship_speed = 2.0
        self.bullet_speed = 6.0
        self.alien_speed = 0.4
        # fleet_direction of 1 represents right; -1 represents left.
        self.fleet_direction = 1

    def increase_speed(self):
        """Increase speed settings and alien point values."""
        self.ship_speed *= self.speedup_scale
        self.bullet_speed *= self.speedup_scale
        self.alien_speed *= self.speedup_scale

        self.alien_points = int(self.alien_points * self.score_scale)
        print(self.alien_points)