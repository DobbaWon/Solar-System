Solar System is a project which displays the Sun, with all 8 planets orbiting it.
This also includes the Asteroid Belt, and Saturns rings.
Not only this, but Earth and Jupiter also have 5 moons between them, all displayed orbiting their repsective planets.
This project is done in an Object Oriented manner, with classes for each object.

The CelestialBody class acts as a template, storing the values required by each subclass, as well as getters for these values.
The Sun class acts as an easy way of creating a Sun in the centre of the screen, by simply calling 'new Sun();' the class simply inputs the correct values into the CelestialBody class.

The Planet class acts as a template for the other objects, such as moons, planets and asteroids, and inherits from the CelestialBody class, and adds the distance, angle and rotationVelocity values.
It also has a method for adjusting the angle of the planet from the Sun, by adding the rotationVelocity to the angle.

The Moon class acts as a template for the Moons in the Solar System, and inherits from the Planet class. The Moon class stores its own Planet, which it uses to orbit around.

The Asteroid class acts as a template for the Asteroids in the Asteroid Belt, and inherits from the Planet class. The Asteroid class allows the Main class to input an angle to start from, overwriting the original value of 0.

The Main class is where all of the objects are stored and updated. The class stores a Sun, as well as Planets, Moons and Asteroids in their own lists. These lists get populated by their own methods.
These lists also get updated by their own methods too. This includes both the drawing of the objects onto screen, as well as any change in position for these objects.