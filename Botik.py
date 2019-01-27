import config
import telebot
from telebot import types

bot = telebot.TeleBot(796126828:AAFGQpvY9ULVfiPgmAOR5YQuaUANBAVtFuc)
owner = "268811241"
bot.polling(none_stop = True, interval=0)
@bot.message_handler(commands=['start'])
def start(message):
    bot.send_message(message.chat.id, 'Hello \n\n Write /help for help.')

@bot.message_handler(commands=['help'])
def start(message):
    bot.send_message(message.chat.id, 'Help message')

@bot.message_handler(content_types=['text'])
def messages(message):
    if int(message.chat.id) == int(config.owner):
        try:
            chatId=message.text.split(': ')[0]
            text=message.text.split(': ')[1]
            bot.send_message(chatId, text0
        except:
            pass
    else:
        bot.send_message(config.owner, str(message.chat.id)+ ': ' + message.text)
        bot.send_message(message.chat.id, '%s, wait please'%message.chat.username)

