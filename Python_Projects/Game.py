import pygame
import time
import random
# requirement from pygame
pygame.font.init()

WIDTH, HEIGHT = 1000, 600
WIN = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Dodge")

BackGround = pygame.transform.scale(pygame.image.load("orange_textile.jpg"), (WIDTH, HEIGHT))

PLAYER_WIDTH = 40
PLAYER_HEIGHT = 60

PLAYER_VEL = 5
BRICK_VEL = 3

BRICKS_WIDTH = 10
BRICKS_HEIGHT = 20

FONT = pygame.font.SysFont("ariel", 35)

def draw(player, elapsed_time, bricks):
    # blit is spacial method to use to draw image or surface to the screen.
    # (0,0) is the top left, so we go from there to the lowest right.
    WIN.blit(BackGround, (0, 0))
# we pass the text we want by the time we calculated in elapsed_time,
# we round the time to the nearest seconds. the 1 makes the text look a  little better,
# and then pass the color we want. ( in this case green)
    time_text = FONT.render(f"TIME: {round(elapsed_time)}s", 1, "green")
    WIN.blit(time_text,(10, 10))
    # blue = (0(R), 255(B), 0(G)) => RGB
    pygame.draw.rect(WIN, "blue", player)
# draw the bricks after the player
    for brick in bricks:
        pygame.draw.rect(WIN, "black", brick)

    pygame.display.update()

def main():
    run = True

    player = pygame.Rect(200,HEIGHT - PLAYER_HEIGHT, PLAYER_WIDTH,PLAYER_HEIGHT)
    clock  = pygame.time.Clock()

# saves the time we started at.
    start_time = time.time()
    elapsed_time = 0

    bricks_adds_increment = 2000
    bricks_count = 0

    bricks = []
    hit = False

    while run:
        bricks_count += clock.tick(60)
# every time we iterate we get what current time is, and minus the start_time,
# which gives us amount of seconds tha elapsed since we started.
        elapsed_time = time.time() - start_time

        if bricks_count > bricks_adds_increment:
            # _ -> only want to loop 3 times
            # generate 3 bricks for us
            for _ in range(3):
                bricks_x = random.randint(0, WIDTH - BRICKS_WIDTH)
                brick = pygame.Rect(bricks_x, -BRICKS_HEIGHT, BRICKS_WIDTH, BRICKS_HEIGHT)
                bricks.append(brick)

            bricks_adds_increment = max(200, bricks_adds_increment - 50)
            bricks_count = 0


# for loop if we want to quit the game,
# so we check every event.
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                run = False
                break

        moves = pygame.key.get_pressed()
        if moves[pygame.K_LEFT] and player.x - PLAYER_VEL >= 0:
            player.x -= PLAYER_VEL
        if moves[pygame.K_RIGHT] and player.x + PLAYER_VEL + PLAYER_WIDTH <= WIDTH:
            player.x += PLAYER_VEL
# loop in copy of the list
        for brick in bricks[:]:
            brick.y += BRICK_VEL
            if brick.y > HEIGHT:
                bricks.remove(brick)
            elif brick.y + brick.height >= player.y and brick.colliderect(player):
                bricks.remove(brick)
                hit = True
                break
        if hit:
            lost_text = FONT.render(f"You Lost!,you lost after: {round(elapsed_time)}s", 1, "yellow")
            WIN.blit(lost_text, (WIDTH/2 - lost_text.get_width()/2,
                                 HEIGHT/2 - lost_text.get_height()/2))
            pygame.display.update()
            pygame.time.delay(4000)
            break

        draw(player, elapsed_time, bricks)

    pygame.quit()
    # this statement below make sure we run the
    # orders above.:
    # -> if __name__ == "_main_":
    #   main()
main()
