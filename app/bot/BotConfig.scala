package bot

import scala.concurrent.duration.Duration

/**
  * Info from the config file.
  *
  * @param baseURL Fully qualified URL for Haruko's web interface.
  * @param botToken Discord API token.
  * @param cmdPrefix Haruko will only listen for commands that start with this string.
  * @param colorRolePrefix Prepended to every color name so Haruko knows which roles are colors it can manage.
  * @param pronounRoleNames Whitelist of pronoun roles Haruko will manage.
  * @param timezoneRolePrefix Prepended to every timezone so Haruko knows which roles are timezones it can manage.
  * @param guilds Per-guild configuration and whitelist.
  *               Haruko will only listen for commands from these guilds.
  * @param dbTimeout Wait this long for any database operation.
  * @param reaperInterval Wait this long between checking the deletion queue.
  */
case class BotConfig(
  baseURL: String,
  botToken: String,
  cmdPrefix: String,
  colorRolePrefix: String,
  pronounRoleNames: Set[String],
  timezoneRolePrefix: String,
  guilds: Map[String, GuildConfig],
  dbTimeout: Duration,
  reaperInterval: Duration
)
