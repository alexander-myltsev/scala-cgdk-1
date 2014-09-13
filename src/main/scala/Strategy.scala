import model.{Game, Hockeyist, Move, World}

/**
 * Стратегия --- интерфейс, содержащий описание методов искусственного интеллекта хоккеиста.
 * Каждая пользовательская стратегия должна реализовывать этот интерфейс.
 * Может отсутствовать в некоторых языковых пакетах, если язык не поддерживает интерфейсы.
 */
trait Strategy {
  /**
   * Основной метод стратегии, осуществляющий управление хоккеистом.
   * Вызывается каждый тик для каждого хоккеиста.
   * @param self  Хоккеист, которым данный метод будет осуществлять управление.
   * @param world Текущее состояние мира.
   * @param game  Различные игровые константы.
   * @return Результатом работы метода является изменение полей данного объекта.
   */
  def move(self: Hockeyist, world: World, game: Game): Move
}
