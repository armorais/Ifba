#include "mainwindow.h"
#include "ui_mainwindow.h"
#include <QStringListModel>
#include <QtDebug>
#include <pizzacontroller.h>

MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);
    QObject::connect(ui->addButton, &QPushButton::released, this, &MainWindow::addToBuffer);
    QObject::connect(ui->removeButton, &QPushButton::released, this, &MainWindow::removeFromBuffer);
    QObject::connect(ui->assarButton, &QPushButton::released, this, &MainWindow::bakeFromBuffer);


}

void MainWindow::setIngredients(QStringList* list)
{
    ingredients=list;
    QStringListModel *model = new QStringListModel(ui->listOptions);
    model->setStringList(*ingredients);
    ui->listOptions->setModel(model);
    ui->listOptions->setCurrentIndex(model->index(0,0));
}

void MainWindow::addToBuffer()
{
    QString addedIngredient;
    QModelIndex index = ui->listOptions->currentIndex();
    QString item = index.data(Qt::DisplayRole).toString();
    ui->listChosen->addItem(item);
    ui->listChosen->setCurrentRow(0);
}

void MainWindow::bakeFromBuffer()
{
    QStringList *items = new QStringList;
    qDebug() << ui->listChosen->count() << " items";

    for(int index=0 ; index < ui->listChosen->count() ; index++)
        items->append(ui->listChosen->item(index)->text());

    PizzaController* controller = new PizzaController;
    controller->setIngredients(items);
}

void MainWindow::removeFromBuffer()
{
    qDeleteAll(ui->listChosen->selectedItems());
}

MainWindow::~MainWindow()
{
    delete ui;
    delete ingredients;
    delete buffer;
}
