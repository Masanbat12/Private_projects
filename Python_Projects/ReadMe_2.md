# Alien Invasion Game
Alien Invasion is a classic arcade-style game developed using Python's pygame library. 
In this game, players control a ship and have to shoot down 
incoming aliens while avoiding getting hit by them.
<img width="641" alt="Screenshot 2023-08-26 191251" src="https://github.com/Masanbat12/Private_projects/assets/93978448/5d86120a-94ad-4ecd-8184-3973b00b4acf">
## Features:
Colorful game visuals with a detailed ship, aliens, and stars.
A responsive ship controlled by arrow keys.
Shooting capability with spacebar to destroy aliens.
Progressive difficulty - as players destroy entire fleets of aliens, new fleets appear that move faster.
Score tracking and high score system.
"Play" button to start a game session.
Sound and other game effects (If you added them or plan to add them in future).
## Requirements:
Python 3.x
pygame library
## How to Play:
### Setup:
Clone this repository: git clone [url-of-this-repo]
Navigate to the repository: cd path-to-the-repo
Install pygame: pip install pygame
### Launch:
Run the game: python alien_invasion.py
### Controls:
Move the ship right: Right Arrow Key
Move the ship left: Left Arrow Key
Shoot bullets: Spacebar
Quit the game: Q Key
### Objective:
Your aim is to shoot down all the alien ships before they reach the bottom.
If an alien ship touches your ship or reaches the bottom of the screen, you lose a life.
The game ends when you lose all your lives.
## Development:
This game was developed using the following classes:
Settings: To manage all game settings like screen width, height, ship speed, bullet settings, etc.
Ship: Manages the player's ship, its position, movement, and visuals.
Bullet: Manages the bullets shot by the player's ship.
Alien: Defines the alien's properties, visuals, and movements.
Star: For background stars in the game for visual appeal.
GameStats: Manages and tracks game statistics.
Button: Used to create the 'Play' button.
Scoreboard: Manages and displays the player's score.
## Contributing:
Feel free to fork this repository, make changes, and submit pull requests. Any feedback, new features, or improvements are welcome!
