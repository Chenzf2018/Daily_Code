# LISTING 7.3 TV.py


class TV:
    def __init__(self):
        self.channel = 1
        self.volume_level = 1
        self.on = False

    def turn_on(self):
        self.on = True

    def turn_off(self):
        self.on = False

    def get_channel(self):
        return self.channel

    def set_channel(self, channel):
        if self.on and 1 <= self.channel <= 120:
            self.channel = channel

    def get_volume_level(self):
        return self.volume_level

    def set_volume_level(self, volume_level):
        if self.on and \
                1 <= self.volume_level <= 70:
            self.volume_level = volume_level

    def channel_up(self):
        if self.on and self.channel < 120:
            self.channel += 1

    def chanel_down(self):
        if self.on and self.channel > 1:
            self.channel -= 1

    def volume_up(self):
        if self.on and self.volume_level < 70:
            self.volume_level += 1

    def volume_down(self):
        if self.on and self.volume_level > 1:
            self.volume_level -= 1
