#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>

namespace Ui {
class MainWindow;
}

class MainWindow : public QMainWindow
{
    Q_OBJECT

public:
    Ui::MainWindow *ui;
    explicit MainWindow(QWidget *parent = nullptr);
    void setIngredients(QStringList* list);
    void addToBuffer();
    void removeFromBuffer();
    void bakeFromBuffer();
    ~MainWindow();
private:
    QStringList* ingredients;
    QStringList* buffer;

};

#endif // MAINWINDOW_H
